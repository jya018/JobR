package com.capstone.JobR.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.capstone.JobR.employment.EmploymentVO;

@Mapper
public interface IEmploymentMapper {
	//게시글 등록 기능
	int insert(EmploymentVO employment);
	
	//게시글 목록 조회 기능 getArticleList
	List<EmploymentVO> getEmploymentList();
	
	//분류 게시글 목록 조회 기능
	List<EmploymentVO> getSortEmploymentList(String empSort);
	
	//게시글 상세 조회 기능
	EmploymentVO getEmployment(int empNum);
	
	//게시글 수정 기능 update
	int update(@Param("empNum") int empNum,@Param("employment") EmploymentVO employment);
	
	//게시글 삭제 기능 delete
	int delete(int empNum);

}
