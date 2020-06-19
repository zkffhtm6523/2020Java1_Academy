package com.kita.first.level3;

public class Car extends Object{
	String name;
	String color;
	int cc;
	
	public Car() {
		this("소나타","흰색",2500);
	}
	
	public Car(String name, String color, int cc) {
		super(); //내 직속 부모의 주소값,Object의 기본 생성자 호출한다는 의미
		this.name = name; //
		//객체화가 된 나의 주소값, this
		//car.name과 같은 의미가 됨
		this.color = color;
		this.cc = cc;
		
	}
	//생성자 : 이름이 클래스명과 같다(자바만)/리턴타입이 없다./오버로딩 가능
	
	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc입니다.\n",name,color,cc);
	}
	//전역 변수를 쓰고 있어서 String name을 사용하고 있음
}
