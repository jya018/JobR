package com.capstone.JobR.board;

import java.util.List;

import com.capstone.JobR.board.BoardVO;

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
	
	//메인 화면에서 모든 게시글 검색
	List<BoardVO> getSearchList(String option, String keywords);
	
	//각 카테고리내에서 검색
	List<BoardVO> getboardSearchList(String boardSort,String option, String keywords);
	
	//모든 게시글 조회
	List<BoardVO> getAll();
	
	//모든 게시글 좋아요 순으로 조회
	List<BoardVO> getGoodBoard();
}
