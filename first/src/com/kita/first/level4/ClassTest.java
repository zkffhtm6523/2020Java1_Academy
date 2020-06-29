package com.kita.first.level4;

public class ClassTest {
	public static void main(String[] args) {
		ClassC c = new ClassC();
		//기본 생성자 안에 super();[부모의 "기본 생성자"]가 들어있기 때문에 
		//object -> classA -> classB -> classC
		//stack관계 c가 먼저 쌓이고 b가 먼저 쌓이고.....
		System.out.println("----다형성----");
		ClassA c1 = new ClassB();
		c1.print();
		System.out.println("c1.x : "+c1.x+"c1은 classB의 업캐스팅");
		
		System.out.println("------------");
		ClassA c2 = new ClassC();
		c2.print(); //객체 기준으로 클래스 C가 실행된다.
//		c2.showMe();//레퍼런스 타입이 알고있는 것만 실행ㅇ된다.
		//강제 형변환을 통해서 바꿔줘야됨
		//업스케일
		ClassB clsb = (ClassB)c1;
		//원래  c1은 classB의 주소값이다.
//		((ClassB)c2).showMe();
		
		//변수 안 담고 showme 호출하는 방법
		clsb.showMe();
		
		System.out.println("------------");
		ClassA c3 = new ClassA();
		c3.print();
		
//		Class clsb = new ClassA(); 2번 : 할 수 없음
		
	/*
	 * 다형성
	 * 1. 부모타입은 자식 객체 주소값은 저장할 수 있다.(가리킬 수 있다)
	 * 2. 자식타입은 부모 객체 주소값을 저장할 수 없다.(가리킬 수 없다)
	 * 3. 타입은 메소드 호출할 수 있나 없나 결정
	 * 자기가 알고 있는 메소드만 호출할 수 있다
	 * 호출했을 때는 객체 기준으로 실행이 된다.
	 */
	}
}
