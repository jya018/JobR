package com.capstone.JobR.spec;

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

import com.capstone.JobR.spec.SpecVO;
import com.capstone.JobR.spec.ISpecService;

@RestController
@RequestMapping("/spec")	
public class SpecController {

//	cotroller(url요청 처리) -> service (잡다한, 계산) -> repository(mapper)(db연결)
	
	@Autowired
	private ISpecService service;

	// 모든 스펙 목록 출력
	@GetMapping		    //GET : 다 보여주는거
	public List<SpecVO> list() {
		return service.getSpecList();
	}

	// 스펙 게시물 작성 요청
	@PostMapping		//POST : 숨기는거, Body에 숨기기 
	public String write(@RequestBody SpecVO spec) {
		if(service.insert(spec) == 1) {
			return "success";
		}
		return "fail";
	}
	
	// 스펙 상세 조회 요청
	@GetMapping("/{ID}")	//ex) 1번 게시글 조회 : localhost:8080/board/1 
	public SpecVO content(@PathVariable String ID) {
		return service.getSpec(ID);
	}

	// 스펙 수정 처리 요청
	@PutMapping("/{ID}")  //GET + POST  수정할 (게시판 번호 + 게시판 정보)
	public String modify(@PathVariable String ID, @RequestBody SpecVO spec) {
		if (service.update(ID, spec) == 1) {
			return "success";
		};
		return "fail";
	}
	
	// 스펙 삭제 처리 요청
	@DeleteMapping("/{ID}")	//ex) 1번 게시글 삭제 : localhost:8080/board/1 
	public String delete(@PathVariable String ID) {
		if(service.delete(ID) == 1) {
			return "success";
		}
		return "fail";
	}
	
	
}
