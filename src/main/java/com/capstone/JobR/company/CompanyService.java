package com.capstone.JobR.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.JobR.repository.ICompanyMapper;

@Service
public class CompanyService implements ICompanyService {

	@Autowired
	private ICompanyMapper mapper;
	
	@Override
	public int insert(CompanyVO company) {
		return mapper.insert(company);
	}

	@Override
	public List<CompanyVO> getCompanyList() {
		List<CompanyVO> list = mapper.getCompanyList();
		
		return list;
	}

	@Override
	public CompanyVO getCompany(String compName) {
		return mapper.getCompany(compName);
	}

	@Override
	public int update(String compName, CompanyVO emp) {
		return mapper.update(compName, emp);
	}

	@Override
	public int delete(String compName) {
		return mapper.delete(compName);
	}

}
