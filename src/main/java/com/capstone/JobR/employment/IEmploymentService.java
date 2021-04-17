package com.capstone.JobR.employment;

import java.util.List;

public interface IEmploymentService {
	//게시글 등록 기능
	int insert(EmploymentVO employment);

	//게시글 목록 조회 기능
	List<EmploymentVO> getEmploymentList();
	
	//분류 게시글 목록 조회 기능
	List<EmploymentVO> getSortEmploymentList(String empSort);

	//게시글 상세 조회 기능
	EmploymentVO getEmployment(int empNum);
	
	//게시글 수정 기능 update
	int update(int empNum, EmploymentVO employment);

	//게시글 삭제 기능 delete
	int delete(int empNum);
}
