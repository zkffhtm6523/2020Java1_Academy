package com.kita.first.level6;

//추상메소드를 하나라도 가지고 있으면 클래스 앞에 abstract를 붙여야 함
//1. 객체화가 안됨
//2. 부모역할만 하겠음
//3. abstract 메소드 없어도 abstract를 클래스 앞에 붙일 수 있음. 객체화 하기 싫음
//쓰고 싶으면 상속하시오.
//추상 메소드는 강제 오버라이딩

//abstract 클래스 : 객체화 하지마
//abstract 메소드 : 오버라이딩 해!

//인터페이스는 일반 메소드까지 없을 때
public abstract class Player {
	public abstract void play();
	
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}
class CDPlayer extends Player{

	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
	
}

class DVDPlayer extends Player{

	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
	}
}