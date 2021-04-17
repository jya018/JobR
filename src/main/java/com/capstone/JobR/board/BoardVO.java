package com.capstone.JobR.board;

public class BoardVO {
	private int boardNum;
	private String boardName; //
	private String boardCont; //
	private String nickname;  //
	private String boardDate;
	private int view;
	private int good;
	private String boardSort; //
	
	public BoardVO() {
		super();
	}
	
	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardName=" + boardName + ", boardCont=" + boardCont + ", nickname="
				+ nickname + ", boardDate=" + boardDate + ", view=" + view + ", good=" + good + ", boardSort="
				+ boardSort + "]";
	}
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardCont() {
		return boardCont;
	}
	public void setBoardCont(String boardCont) {
		this.boardCont = boardCont;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public String getBoardSort() {
		return boardSort;
	}
	public void setBoardSort(String boardSort) {
		this.boardSort = boardSort;
	}
	
	

	
}
