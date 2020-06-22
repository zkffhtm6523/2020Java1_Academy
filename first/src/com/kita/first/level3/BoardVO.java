package com.kita.first.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO(String title, String content, int writeId) {
		super(); //익힐 때 까지 타이핑
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}
	//생성자가 하나도 없을 때 기본 생성자를 넣어줌
	
	public BoardVO() {}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getWriteId() {
		return writeId;
	}
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	
	/*
	 * private	같은 클래스
	 * default	같은 패키지
	 * protected 같은 패키지+상속관계
	 * public
	 * 
	 * 
	 * 값 넣는 방법 2개 : 생성자, setter
	 * 값 받는 방법 1개 : getter
	 * 
	 * setter : 타입은 무조건 void
	 */
}
