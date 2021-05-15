package com.capstone.JobR.good;

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
@RequestMapping("/good")
public class GoodController {

	@Autowired
	private IGoodService service;
	
	// 특정 회원 좋아요 게시글 조회
	@GetMapping("/{id}")
	List<GoodVO> selectId(@PathVariable String id){
		return service.selectId(id);
	}

	// 특정 게시글 좋아요 누름
	@PostMapping
	String insert(@RequestBody GoodVO good) {
		if(service.insert(good.getBoardNum(), good.getId())==1) {
			return "success";
		}
		return "fail";
	}

	// 특정 게시글 좋아요 취소
	@PutMapping
	String delete(@RequestBody GoodVO good) {
		if(service.delete(good.getBoardNum(), good.getId())==1) {
			return "success";
		}
		return "fail";
	}

	// 회원 탈퇴 시, 좋아요 모두 삭제
	@DeleteMapping("/{id}")
	String deleteId(String id) {
		service.deleteId(id);
		return "success";
	}

}