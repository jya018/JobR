package com.capstone.JobR.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.capstone.JobR.good.GoodVO;

@Mapper
public interface IGoodMapper {

	// 특정 게시글 좋아요 누름
	int insert(int boardNum, String id);

	// 특정 회원 좋아요 게시글 조회
	List<GoodVO> selectId(String id);

	// 특정 게시글 좋아요 취소
	int delete(int boardNum, String id);

	// 회원 탈퇴 시, 좋아요 모두 삭제
	void deleteId(String id);
	
	//게시글 삭제 시, 좋아요 모두 삭제
	void deleteBoard(int boardNum);
	
}
