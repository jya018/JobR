package com.capstone.JobR.comment;

public class CommentVO {
	private int boardNum;		// 게시글 번호
	private int CommentNum;		// 댓글 번호
	private String nickname;    // 닉네임
	private String CommentCont; // 댓글 내용  
	private String CommentDate;
	
	public CommentVO() {
		super();
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public int getCommentNum() {
		return CommentNum;
	}

	public void setCommentNum(int commentNum) {
		CommentNum = commentNum;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCommentCont() {
		return CommentCont;
	}

	public void setCommentCont(String commentCont) {
		CommentCont = commentCont;
	}

	public String getCommentDate() {
		return CommentDate;
	}

	public void setCommentDate(String commentDate) {
		CommentDate = commentDate;
	}

	@Override
	public String toString() {
		return "CommentVO [boardNum=" + boardNum + ", CommentNum=" + CommentNum + ", nickname=" + nickname
				+ ", CommentCont=" + CommentCont + ", CommentDate=" + CommentDate + "]";
	}
	
	
}
