package com.kita.first.level2;
//객체 안에 있으면 메소드
//객체 밖에 있으면 함수
/*
 * 접근제어자 리턴타입 메소드명 (parameter = 매개변수){
 * }
 * 메소드 = 하나하나 작은 업체.메소드 안에 메소드가 없음.
 * c언어는 메소드 위치가 중요하지만, 자바는 상관없음. 클래스 안에만 있으면 됨.
 * 이름 옆에 보라색 말고 괄호가 있다(메소드와 연관이 있다)
 * 
 * void = 일 시켰으면 회신이 없는 것, 리턴을 넣어도 되고 안넣어도 됨.
 * 자동적으로 return;으로 넣어줌 return이면 종료
 * 
 * 비void = 주소값, 일반변수값으로 리턴, 필수임.
 * 
 * 중복된 소스 = 프로그래밍에 죄
 * 
 * 윈도우 64비트 == 8바이트
 * 
 * 레퍼런스 변수 == 8바이트
 */
public class Method1 {
	public static void main(String[] args) {
		sum(10, 15);//같은 파일 안에 있어서 앞에 클래스를 안 적음
		//메소드 안에 메소드 선언은 안 되지만, 호출은 가능함.
		//static이 없으면 실행 안 되고 메모리에 올려줘야됨.
		minus(20,5);
		//20,5는 영어로 argument 한국어로 인자 
		System.out.println(minus1(20,5));
	}
	
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
		if (n1 == 2) {
			return;
		} // return은 실행이 될 수도 있고 안 될수도 있고
		System.out.println(n1 + n2);
		//static은 메모리에 알아서 올라가는 친구
	}
	
	public static void minus(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	
	public static int minus1(int n3, int n4) {
		return n3 - n4;
	}
}
