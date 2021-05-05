package com.capstone.JobR.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.capstone.JobR.company.CompanyVO;

public interface ICompanyMapper {
	//회사정보 등록 기능
	int insert(CompanyVO company);
	
	//회사정보 목록 조회 기능
	List<CompanyVO> getCompanyList();
	
	//회사정보 상세 조회 기능
	CompanyVO getCompany(String compName);
	
	//회사정보 수정 기능 update
	int update(@Param("compName") String compName, @Param("company") CompanyVO company);
	
	//회사정보 삭제 기능 delete
	int delete(String compName);

}
