package com.capstone.JobR.board;

import java.util.List;

public interface IBoardService {
	//게시글 등록 기능
	int insert(BoardVO article);

	//게시글 목록 조회 기능
	List<BoardVO> getBoardList(String boardSort);

	//게시글 상세 조회 기능
	BoardVO getBoard(int boardNum);
	
	//게시글 수정 기능 update
	int update(int boardNum, BoardVO board);

	//게시글 삭제 기능 delete
	int delete(int boardNum);
}
