package com.capstone.JobR.board;

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
@RequestMapping("/board")	// URI -> localhost:8080/board
public class BoardController {
	
	@Autowired
	private IBoardService service;

	// 게시글 목록 출력
	@GetMapping("/sort/{boardSort}")		    //GET : 다 보여주는거
	public List<BoardVO> list(@PathVariable String boardSort) {
		return service.getBoardList(boardSort);
	}

	// 게시글 작성 요청
	@PostMapping		//POST : 숨기는거, Body에 숨기기 
	public String write(@RequestBody BoardVO board) {
		if(service.insert(board) == 1) {
			return "success";
		}
		return "fail";
	}

	// 게시글 상세 조회 요청
	@GetMapping("/{boardNum}")	//ex) 1번 게시글 조회 : localhost:8080/board/1 
	public BoardVO content(@PathVariable int boardNum) {
		return service.getBoard(boardNum);
	}

	// 게시글 수정 처리 요청
	@PutMapping("/{boardNum}")  //GET + POST  수정할 (게시판 번호 + 게시판 정보)
	public String modify( @PathVariable int boardNum, @RequestBody BoardVO board) {
		if (service.update(boardNum, board) == 1) {
			return "success";
		};
		return "fail";
	}
	
	// 게시글 삭제 처리 요청
	@DeleteMapping("/{boardNum}")	//ex) 1번 게시글 삭제 : localhost:8080/board/1 
	public String delete(@PathVariable int boardNum) {
		if(service.delete(boardNum) == 1) {
			return "success";
		}
		return "fail";
	}
}
