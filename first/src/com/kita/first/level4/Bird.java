package com.kita.first.level4;

public class Bird extends Animal{
	//bird도 기본 생성자가 하나도 없다.그래서 만들어줌
	public Bird(String name) {
		super(name,"조류");
	}
	
	void flying() {
		System.out.println("훨~ 훨~");
	}
	//Animal의 오버라이딩
	@Override
	void crying() {
		super.crying();
		System.out.println("짹짹!!");
	}
	
}
