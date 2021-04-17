package com.capstone.JobR.user;

import java.sql.Timestamp;

public class UserVO {
	
	private String id;			//
	private String password;	//
	private String email;		//
	private String nickname;	//
	private String jobSort;		//
	private Timestamp regDate;
	
	public UserVO() {
		super();
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", email=" + email + ", nickname=" + nickname
				+ ", jobSort=" + jobSort + ", regDate=" + regDate + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJobSort() {
		return jobSort;
	}

	public void setJobSort(String jobSort) {
		this.jobSort = jobSort;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	
	
}
