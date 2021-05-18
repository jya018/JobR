package com.capstone.JobR.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.JobR.board.model.BoardVO;
import com.capstone.JobR.repository.IBoardMapper;

@Service
public class BoardService implements IBoardService {

	@Autowired
	private IBoardMapper mapper;
	
	@Override
	public int insert(BoardVO board) {
		return mapper.insert(board);
	}

	@Override
	public List<BoardVO> getBoardList(String boardSort) {
		List<BoardVO> list = mapper.getBoardList(boardSort);
		
		return list;
	}

	@Override
	public BoardVO getBoard(int boardNum) {
		mapper.viewCnt(boardNum);
		return mapper.getBoard(boardNum);
	}

	@Override
	public int update(int boardNum, BoardVO board) {
		return mapper.update(boardNum, board);
	}

	@Override
	public int delete(int boardNum) {
		return mapper.delete(boardNum);
	}

	
	@Override 
	  public List<BoardVO> getSearchList(String option,String keywords){ 
		  return mapper.getSearchList(option, keywords);
	  
	  }
	  
	  @Override 
	  public List<BoardVO> getboardSearchList(String boardSort,String option,String keywords){ 
		  return mapper.getboardSearchList(boardSort,option, keywords);
	  
	  }
}
