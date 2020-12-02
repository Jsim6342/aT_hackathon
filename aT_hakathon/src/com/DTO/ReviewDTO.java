package com.DTO;

public class ReviewDTO {

	private int rev_num;
	private String title;
	private String nickname;
	private String content;
	

	public ReviewDTO() {
		super();
	}
	
	public ReviewDTO(int rev_num, String title, String nickname, String content) {
		super();
		this.rev_num = rev_num;
		this.title = title;
		this.nickname = nickname;
		this.content = content;
	}

	
	
	public int getRev_num() {
		return rev_num;
	}

	public void setRev_num(int rev_num) {
		this.rev_num = rev_num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	
	
	
}
