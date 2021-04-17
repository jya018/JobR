package com.capstone.JobR.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.capstone.JobR.board.BoardVO;

@Mapper
public interface IBoardMapper {
	//게시글 등록 기능
	int insert(BoardVO board);
	
	//게시글 목록 조회 기능 getArticleList
	List<BoardVO> getBoardList(String boardSort);
	
	//게시글 상세 조회 기능
	BoardVO getBoard(int boardNum);
	
	//게시글 수정 기능 update
	int update(int boardNum, BoardVO board);
	
	//게시글 삭제 기능 delete
	int delete(int boardNum);

}
