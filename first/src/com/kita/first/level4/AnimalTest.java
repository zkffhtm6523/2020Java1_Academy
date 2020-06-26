package com.kita.first.level4;

public class AnimalTest {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		Bird bird = new Bird("참새");
		Bird bird2 = new Bird("기러기");
//		Bird bird3 = new Bird();
		
//		animal.crying();
		bird.crying(); //부모 메소드 ->자식메소드에서 오버라이딩
		bird.flying(); //자식 메소드
		
//		Sparrow sparrow = new Sparrow();
		System.out.println("-----------");
//		sparrow.crying();
		bird2.whoAmI();
		
		Sparrow sp = new Sparrow();
		sp.whoAmI();
	}
}
