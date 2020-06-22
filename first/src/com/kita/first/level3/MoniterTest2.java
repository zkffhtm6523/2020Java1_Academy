package com.kita.first.level3;

public class MoniterTest2 {
	public static void main(String[] args) {
		Monitor.brand = "삼성";
		Monitor.printBrand();
		//객체화 안 해도 사용할 수 있음. static이라서 그냥 사용할 수 있음
		//객체마다 다른 값이 저장되는 애들은 붙이는 거 아님. 특수한 경우
		
		
		Monitor m1 = new Monitor();
		m1.printInfo();
		
		int result = Integer.parseInt("11");
		//static이 붙었기 때문에 클래스.메소드로 객체화 없이 바로 사용할 수 있음
	}
}
