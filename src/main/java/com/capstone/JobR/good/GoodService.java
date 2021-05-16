package com.capstone.JobR.good;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.JobR.repository.IGoodMapper;

@Service
public class GoodService implements IGoodService {

	@Autowired
	private IGoodMapper mapper;

	@Override
	public int insert(int boardNum, String id) {
		mapper.insert(boardNum, id);
		return mapper.addGood(boardNum);
	}

	@Override
	public List<GoodVO> selectId(String id) {
		return mapper.selectId(id);
	}

	@Override
	public int delete(int boardNum, String id) {
		mapper.delete(boardNum, id);
		return mapper.subGood(boardNum);
	}

	@Override
	public void deleteId(String id) {
		mapper.deleteId(id);
	}

}
