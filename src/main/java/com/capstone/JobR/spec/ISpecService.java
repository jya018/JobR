package com.capstone.JobR.spec;

import java.util.List;


import com.capstone.JobR.spec.SpecVO;

public interface ISpecService {
	//스펙 등록 기능
	int insert(SpecVO spec);

	//스펙 목록 조회 기능
	List<SpecVO> getSpecList();

	//스펙 상세 조회 기능
	SpecVO getSpec(String ID);
	
	//스펙 수정 기능 update
	int update(String ID, SpecVO spec);

	//스펙 삭제 기능 delete
	int delete(String ID);
	
}
