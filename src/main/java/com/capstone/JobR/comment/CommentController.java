package com.capstone.JobR.comment;

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
@RequestMapping("/comment")	
public class CommentController {

//	cotroller(url요청 처리) -> service (잡다한, 계산) -> repository(mapper)(db연결)
	
	@Autowired
	private ICommentService service;

	// 전체 댓글 출력
	@GetMapping		    //GET : 다 보여주는거
	public List<CommentVO> list() {
		return service.getCommentList();
	}

	//  댓글 작성 요청
	@PostMapping()		//POST : 숨기는거, Body에 숨기기 
	public String write(@RequestBody CommentVO comment) {
		if(service.insert(comment) == 1) {
			return "success";
		}
		return "fail";
	}

	// 해당 게시글 댓글 전체조회 요청
	@GetMapping("/{boardNum}")	//ex) 1번 게시글 조회 : localhost:8080/board/1 
	public List<CommentVO> listContent(@PathVariable int boardNum) {
		return service.getCommentContent(boardNum);
	}

	// 게시글의 특정 댓글 수정 처리 요청
	@PutMapping("/{boardNum}/{commentNum}")  //GET + POST  수정할 (게시판 번호 + 게시판 정보)
	public String modify(@PathVariable int boardNum,@PathVariable int commentNum, @RequestBody CommentVO comment) {
		if (service.update(boardNum, commentNum, comment) == 1) {
			return "success";
		};
		return "fail";
	}
	
	// 게시글 삭제 처리 요청
	@DeleteMapping("/{boardNum}/{commentNum}")	//ex) 1번 게시글 삭제 : localhost:8080/board/1 
	public String delete(@PathVariable int boardNum,@PathVariable int commentNum) {
		if(service.delete(boardNum,commentNum) == 1) {
			return "success";
		}
		return "fail";
	}
	
}
