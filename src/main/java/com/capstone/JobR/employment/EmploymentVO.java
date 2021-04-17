 package com.capstone.JobR.employment;

public class EmploymentVO {
	private int empNum;			// 게시글 번호
	private String empName;		// 게시글 제목
	private String nickname;    // 닉네임
	private String empCont; 	// 게시글 내용
	private String empDate;
	private String empSort;		//직업 분류
	
	public EmploymentVO() {
		super();
	}

	

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmpCont() {
		return empCont;
	}

	public void setEmpCont(String empCont) {
		this.empCont = empCont;
	}

	public String getEmpDate() {
		return empDate;
	}

	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}

	public String getEmpSort() {
		return empSort;
	}

	public void setEmpsort(String empSort) {
		this.empSort = empSort;
	}

	@Override
	public String toString() {
		return "EmploymentVO [empNum=" + empNum + ", emptName=" + empName + ", nickname=" + nickname + ", empCont="
				+ empCont + ", empDate=" + empDate + ", empsort=" + empSort + "]";
	}

	
}
