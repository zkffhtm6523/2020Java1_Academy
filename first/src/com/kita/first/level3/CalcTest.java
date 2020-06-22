package com.kita.first.level3;

public class CalcTest {
	public static void main(String[] args) {
		Calc.sum(10, 20);
		//혼자 있으면 void일 확률이 높다.
		
		System.out.println(Calc.sum(10, 20));
		//같이 있으면 비void일 확률이 높다. return값을 활용하기 때문
		
		Calc calc1 = new Calc();
		
		calc1.n1 = 20;
		calc1.n2 = 30;
		
		System.out.println(calc1.sum());
		
		/*
		 * 전역변수 = 멤버필드, 클래스와 메소드 사이
		 * 지역변수 = 메소드 안에 변수, static 못 붙임
		 * static변수 = 별개 , 클래스 변수
		 * 
		 * 멤버 메소드 = 클래스 안의 메소드
		 * 
		 * 인스턴스 변수 = static이 안 붙은 것
		 * 클래스 변수 = static이 붙은 것,정적 변수
		 * 
		 * 
		 * static 접근 시 클래스명.static 변수 
		 * 클래스 메모리 영역 접근 시 변수 이름이 여러개 있으니까
		 * 클래스명.으로 경유
		 */
		
		
	}
}
