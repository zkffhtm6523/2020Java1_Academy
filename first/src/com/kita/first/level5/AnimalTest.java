package com.kita.first.level5;

public class AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Sparrow();
		ani.cry();
		ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		//업캐스팅
		
		Cat cat = (Cat)ani;
		//cat의 주소값이 있어야 다운캐스팅 할 수 있음
		cat.cry();
		cat.sleep();
		
	}
}
