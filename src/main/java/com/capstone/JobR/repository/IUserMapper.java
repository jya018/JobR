package com.capstone.JobR.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.capstone.JobR.user.UserVO;

@Mapper
public interface IUserMapper {

	// 아이디 중복 체크 기능
	int checkId(String id);

	// 회원 가입 기능
	void register(UserVO user);

	// 비밀번호 변경
	int updatePw(String id, String password);

	// 회원정보(nickname, jobSort) 변경
	int update(String id, UserVO user);

	// 회원 정보 조회 기능
	UserVO selectOne(String id);

	// 회원 탈퇴 기능
	int delete(String id);

	// 회원 정보 전체 조회 기능
	List<UserVO> selectAll();

}
