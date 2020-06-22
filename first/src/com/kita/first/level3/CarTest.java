package com.kita.first.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car0 = new Car();
		Car car1 = new Car("소나타","흰색",2500);
		Car car2 = new Car("그랜저");
		Car car3 = new Car("g80");
		
		car0.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
		
		//자바는 기본적으로 직접 주소값을 접근하는 것을 제한한다.
		//생성자 or getter, setter
		
	}
	
}
