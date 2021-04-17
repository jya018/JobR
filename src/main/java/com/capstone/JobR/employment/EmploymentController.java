package com.capstone.JobR.employment;

import java.util.List;

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
@RequestMapping("/emp")	
public class EmploymentController {

//	cotroller(url요청 처리) -> service (잡다한, 계산) -> repository(mapper)(db연결)
	
	@Autowired
	private IEmploymentService service;

	// 게시글 목록 출력
	@GetMapping	    //GET : 다 보여주는거
	public List<EmploymentVO> list() {
		return service.getEmploymentList();
	}
	
	// 게시글 분류 출력
	@GetMapping("/sort/{empSort}")		    //GET : 다 보여주는거
	public List<EmploymentVO> sortlist(@PathVariable String empSort) {
		return service.getSortEmploymentList(empSort);
	}

	// 게시글 작성 요청
	@PostMapping		//POST : 숨기는거, Body에 숨기기 
	public String write(@RequestBody EmploymentVO employment) {
		if(service.insert(employment) == 1) {
			return "success";
		}
		return "fail";
	}

	// 게시글 상세 조회 요청
	@GetMapping("/{empNum}")	//ex) 1번 게시글 조회 : localhost:8080/board/1 
	public EmploymentVO content(@PathVariable int empNum) {
		return service.getEmployment(empNum);
	}

	// 게시글 수정 처리 요청
	@PutMapping("/{empNum}")  //GET + POST  수정할 (게시판 번호 + 게시판 정보)
	public String modify(@PathVariable int empNum, @RequestBody EmploymentVO employment) {
		if (service.update(empNum, employment) == 1) {
			return "success";
		};
		return "fail";
	}
	
	// 게시글 삭제 처리 요청
		@DeleteMapping("/{empNum}")	//ex) 1번 게시글 삭제 : localhost:8080/board/1 
		public String delete(@PathVariable int empNum) {
			if(service.delete(empNum) == 1) {
				return "success";
			}
			return "fail";
		}
	
}
