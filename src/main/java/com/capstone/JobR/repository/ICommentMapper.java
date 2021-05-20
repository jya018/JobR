package com.capstone.JobR.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.capstone.JobR.comment.CommentVO;

@Mapper
public interface ICommentMapper {
	//게시글 등록 기능
	int insert(CommentVO comment);
	
	//게시글 목록 조회 기능 getArticleList
	List<CommentVO> getCommentList();
	
	//게시글 상세 조회 기능
	List<CommentVO> getCommentContent(int boardNum);
	//CommentVO getComment(int boardNum);
	
	//게시글 수정 기능 update
	int update(@Param("commentNum") int commentNum, @Param("comment") CommentVO comment);
	
	//게시글 삭제 기능 delete
	int delete(@Param("commentNum") int commentNum);

}
