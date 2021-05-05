package com.capstone.JobR.company;

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
@RequestMapping("/company")	// URI -> localhost:8080/board
public class CompanyController {

//	cotroller(url요청 처리) -> service (잡다한, 계산) -> repository(mapper)(db연결)
	
	@Autowired
	private ICompanyService service;

	// 회사정보 목록 출력
	@GetMapping		   
	public List<CompanyVO> list() {
		return service.getCompanyList();
	}

	// 회사정보 작성 요청
	@PostMapping		 
	public String write(@RequestBody CompanyVO company) {
		if(service.insert(company) == 1) {
			return "success";
		}
		return "fail";
	}

	// 회사정보 상세 조회 요청
	@GetMapping("/{compName}")
	public CompanyVO content(@PathVariable String compName) {
		return service.getCompany(compName);
	}

	// 회사정보 수정 처리 요청
	@PutMapping("/{compName}")
	public String modify(@PathVariable String compName, @RequestBody CompanyVO company) {
		if (service.update(compName, company) == 1) {
			return "success";
		};
		return "fail";
	}
	
	// 회사정보 삭제 처리 요청
		@DeleteMapping("/{compName}")	
		public String delete(@PathVariable String compName) {
			if(service.delete(compName) == 1) {
				return "success";
			}
			return "fail";
		}
	
}
