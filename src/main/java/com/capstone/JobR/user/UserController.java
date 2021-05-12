package com.capstone.JobR.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;

	// 아이디 중복 확인 요청 처리
	@GetMapping("/{id}")
	public String checkId(@PathVariable String id) {
		int checkId = service.checkId(id);
		if (checkId == 1) {
			// 아이디 중복됨
			return "fail";
		} else {
			// 아이디 사용가능
			return "success";
		}

	}

	// 회원 가입 요청 처리
	@PostMapping
	public String regsiter(@RequestBody UserVO user) {
		service.register(user);
		return "success";
	}

	// 비밀번호 변경
	@PostMapping("/{id}")
	public String updatePw(@PathVariable String id, @RequestBody UserVO user) {
		if(service.updatePw(id, user.getPassword())==1) {
			return "success";
		}
		return "fail";
	}

	// 회원정보 변경
	@PutMapping("/{id}")
	public String update(@PathVariable String id, @RequestBody UserVO user) {
		if(service.update(id, user)==1) {
			return "success";
		}
		return "fail";
	}
	
	// 회원 삭제
	@DeleteMapping("/{id}")
	public String delete(@PathVariable String id) {
		if(service.delete(id)==1) {
			return "success";
		}
		return "fail";
	}

	
	//로그인 요청 처리
	@PostMapping("/log/{id}")
	public String loginCheck(@PathVariable String id, @RequestBody UserVO user, HttpSession session) {
		/*
	       # 클라이언트가 전송한 id값과 pw값을 가지고 DB에서 회원의 정보를
	        조회해서 불러온 다음 값 비교를 통해
	        1. 아이디가 없는 경우 클라이언트 측으로 문자열 idFail 전송.
	        2. 비밀번호가 틀렸을 경우 문자열 pwFail전송.
	        3. 로그인 성공 시 문자열 loginSuccess 전송.
		 */

		//서버에서 세션 객체를 얻는 방법.
		//1. HttpServletRequest객체 사용.
		//HttpSession session = request.getSession();
		
		String result = null;
		UserVO DB = service.selectOne(id);

		if(DB != null) {
			if(user.getPassword().equals(DB.getPassword())) {
				//로그인 성공, 세션 데이터 생성 (로그인 유지)
				session.setAttribute(DB.getId(), DB);
				
//				result = "loginSuccess";
				result = (String) session.getAttribute(DB.getId());
			}else {
				result = "PW Fail";
			}
		}else {
			result = "ID Fail";
		}
		
		return result;
	}

	// 로그아웃 처리
	@GetMapping("/log/{id}")
	public String logout(@PathVariable String id,HttpSession session) {

		UserVO vo = (UserVO) session.getAttribute(id);

		if (vo != null) {
			//로그아웃 성공
			session.removeAttribute(id);
			
//			session.invalidate();  //세션 초기화
			
			return "success";
		}
		return "fail";
	}

}