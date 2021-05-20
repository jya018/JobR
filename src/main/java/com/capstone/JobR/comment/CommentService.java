package com.capstone.JobR.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.JobR.repository.ICommentMapper;

@Service
public class CommentService implements ICommentService {

	@Autowired
	private ICommentMapper mapper;
	
	@Override
	public int insert(CommentVO comment) {
		return mapper.insert(comment);
	}

	@Override
	public List<CommentVO> getCommentList() {
		List<CommentVO> list = mapper.getCommentList();
		
		return list;
	}

	@Override
	public List<CommentVO> getCommentContent(int boardNum) {
		return mapper.getCommentContent(boardNum);
	}

	@Override
	public int update(int commentNum, CommentVO comment) {
		return mapper.update(commentNum, comment);
	}

	@Override
	public int delete(int commentNum) {
		return mapper.delete(commentNum);
	}

}
