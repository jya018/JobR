package com.capstone.JobR.comment;

import java.util.List;

public interface ICommentService {
	//게시글 등록 기능
	int insert(CommentVO comment);

	//게시글 목록 조회 기능
	List<CommentVO> getCommentList();

	//게시글 상세 조회 기능
	List<CommentVO> getCommentContent(int boardNum);
	
	//게시글 수정 기능 update
	int update(int commentNum, CommentVO comment);

	//게시글 삭제 기능 delete
	int delete(int commentNum);
}
