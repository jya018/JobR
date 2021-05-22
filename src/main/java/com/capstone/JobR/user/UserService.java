package com.capstone.JobR.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.JobR.repository.IUserMapper;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserMapper mapper;
	
	@Override
	public int checkId(String id) {
		return mapper.checkId(id);
	}

	@Override
	public int checkNickname(String nickname) {
		return mapper.checkNickname(nickname);
	}
	
	@Override
	public void register(UserVO user) {
		
		//회원 비밀번호를 암호화 인코딩
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		String securePw = encoder.encode(user.getPassword());
//		System.out.println("암호화 후: "+ securePw);
//		user.setPassword(securePw);
		
		mapper.register(user);		
	}
	
	@Override
	public int updatePw(String id, String password) {
		return mapper.updatePw(id, password);
	}
	
	@Override
	public int update(String id, UserVO user) {
		return mapper.update(id, user);
	}

	@Override
	public UserVO selectOne(String id) {
		return mapper.selectOne(id);
	}

	@Override
	public int delete(String id) {
		return mapper.delete(id);
	}

	@Override
	public List<UserVO> selectAll() {
		return null;
	}

}
