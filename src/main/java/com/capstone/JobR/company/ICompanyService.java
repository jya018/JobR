package com.capstone.JobR.company;

import java.util.List;

public interface ICompanyService {
	//회사정보 등록 기능
	int insert(CompanyVO company);

	//회사정보 목록 조회 기능
	List<CompanyVO> getCompanyList();

	//회사정보 상세 조회 기능
	CompanyVO getCompany(String compName);
	
	//회사정보 수정 기능 update
	int update(String compName, CompanyVO company);

	//회사정보 삭제 기능 delete
	int delete(String compName);
}
