package com.kita.first.level4;

public class ValueTest2 {
	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println("str : "+str);
		
		System.out.println();
		//println이 오버로딩되어있다.
		Value val = new Value(2000);
		System.out.println("val : "+val.toString());
		System.out.println("val : "+val);
		
//		String strVal = String.valueOf(val);
//		String strVal2 = val.toString();
		
//		System.out.println(strVal);
//		System.out.println(strVal2);
		
//		final을 클래스 앞에 붙이면 상속 금지
//		String 앞에 final이 붙어 있음
		
//		메소드 앞에 final 붙으면 오버라이딩 금지
	}
}
