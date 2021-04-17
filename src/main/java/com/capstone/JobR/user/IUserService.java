package com.capstone.JobR.user;

import java.util.List;

public interface IUserService {

	//아이디 중복 체크
	int checkId(String account);

	//회원 가입
	void register(UserVO user);
	
	//비밀번호 변경
	int updatePw(String id, String password);
	
	//회원정보(nickname, jobSort) 변경
	int update(String id, UserVO user);
	
	//회원 정보 조회
	UserVO selectOne(String id);
	
	//회원 탈퇴
	int delete(String id);
	
	//회원 정보 전체 조회
	List<UserVO> selectAll();

	
}
