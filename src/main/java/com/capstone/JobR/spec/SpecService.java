package com.capstone.JobR.spec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capstone.JobR.spec.SpecVO;
import com.capstone.JobR.repository.ISpecMapper;

@Service
public class SpecService implements ISpecService {

	@Autowired
	private ISpecMapper mapper;
	
	@Override
	public int insert(SpecVO spec) {
		return mapper.insert(spec);
	}

	@Override
	public List<SpecVO> getSpecList() {
		List<SpecVO> list = mapper.getSpecList();
		
		return list;
	}
	
	@Override
	public SpecVO getSpec(String ID) {
		return mapper.getSpec(ID);
	}

	@Override
	public int update(String ID, SpecVO spec) {
		return mapper.update(ID, spec);
	}

	@Override
	public int delete(String ID) {
		return mapper.delete(ID);
	}
	
	@Override
	public List<String> companyList() {
		return mapper.companyList();
	}
	
	@Override
	public List<SpecVO> companySpecList(String companyName) {
		return mapper.companySpecList(companyName);
	}

}
