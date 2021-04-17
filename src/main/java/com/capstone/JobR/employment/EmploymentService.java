package com.capstone.JobR.employment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.JobR.repository.IEmploymentMapper;

@Service
public class EmploymentService implements IEmploymentService {

	@Autowired
	private IEmploymentMapper mapper;
	
	@Override
	public int insert(EmploymentVO employment) {
		return mapper.insert(employment);
	}

	@Override
	public List<EmploymentVO> getEmploymentList() {
		List<EmploymentVO> list = mapper.getEmploymentList();
		
		return list;
	}

	@Override
	public EmploymentVO getEmployment(int empNum) {
		return mapper.getEmployment(empNum);
	}

	@Override
	public int update(int empNum, EmploymentVO employment) {
		return mapper.update(empNum, employment);
	}

	@Override
	public int delete(int empNum) {
		return mapper.delete(empNum);
	}

	@Override
	public List<EmploymentVO> getSortEmploymentList(String empSort) {
		return mapper.getSortEmploymentList(empSort);
	}

}
