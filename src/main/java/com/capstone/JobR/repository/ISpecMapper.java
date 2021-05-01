package com.capstone.JobR.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;


import com.capstone.JobR.spec.SpecVO;

public interface ISpecMapper {
	//스펙 등록 기능
	int insert(SpecVO spec);
	
	//스펙 목록 조회 기능 getSpecList
	List<SpecVO> getSpecList();
	
	//스펙 상세 조회 기능
	SpecVO getSpec(String ID);
	
	//스펙 수정 기능 update
	int update(@Param("ID") String ID,@Param("spec") SpecVO spec);
	
	//스펙 삭제 기능 delete
	int delete(String ID);
	
	//스펙으로 등록된 회사 목록
	List<String> companyList();
		
	//해당 회사 스펙 목록 조회
	List<SpecVO> companySpecList(String companyName);

}
