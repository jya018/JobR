package com.capstone.JobR.spec;

public class SpecVO {
	private String id;
	private String companyName; //	회사이름
	private int toeic; 			// 토익
	private int toefl;  		// 토플
	private int teps;			// 탭스
	private int opic;			// 오픽
	private int tos;			// 토스
	private boolean internship; // 인턴쉽
	private String degree;		// 최종학력
	private float score;		// 학점
	
	public SpecVO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getToeic() {
		return toeic;
	}

	public void setToeic(int toeic) {
		this.toeic = toeic;
	}

	public int getToefl() {
		return toefl;
	}

	public void setToefl(int toefl) {
		this.toefl = toefl;
	}

	public int getTeps() {
		return teps;
	}

	public void setTeps(int teps) {
		this.teps = teps;
	}

	public int getOpic() {
		return opic;
	}

	public void setOpic(int opic) {
		this.opic = opic;
	}

	public int getTos() {
		return tos;
	}

	public void setTos(int tos) {
		this.tos = tos;
	}

	public boolean isInternship() {
		return internship;
	}

	public void setInternship(boolean internship) {
		this.internship = internship;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "SpecVO [id=" + id + ", companyName=" + companyName + ", toeic=" + toeic + ", toefl=" + toefl + ", teps="
				+ teps + ", opic=" + opic + ", tos=" + tos + ", internship=" + internship + ", degree=" + degree
				+ ", score=" + score + "]";
	}
	
	

	
}
