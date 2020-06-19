package com.kita.first.level3;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv();//new 키워드가 TV의 주소값을 리턴하여 tv1에 넣어줌
		//tv1에 안 넣어주면 gc에 들어가서 나중에 소멸된다. 
		//tv1에 주소값 하나가 저장되어 있다.
		//멤버 필드와 멤버 메소드
		//Tv타입의 tv1에 넣어줌 
		
		//기본 생성자. 객체를 생성할 때 한 번만 씀.
		
		//지역 변수는 Tv tv1 = null;로 초기화해줘야됨.
		//전역 변수는 Tv tv1;도 됨.
		
		//객체 사용 = 주소값.~~
		System.out.println("name : "+tv1.name);
		System.out.println("power : "+tv1.power);
		System.out.println("channel : "+tv1.channel);
		
		System.out.println("-------------");
		tv1.name = "삼성TV";
		System.out.println("name : "+tv1.name);
		tv1.changePower();
		System.out.println("power : "+tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel : "+tv1.channel);
	}
}
