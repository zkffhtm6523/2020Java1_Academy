package com.kita.first.level4;

public class ValueTest {
	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");
		
		System.out.println("1: "+(str == str2));
		System.out.println("2: "+str.equals(str2));
		//String은 equals를 부모껄 안 쓰고 오버라이딩
		System.out.println();
		Value val1 = new Value(1);
		Value val2 = new Value(1);
		
		System.out.println("1: "+(val1 == val2));
		System.out.println("2: "+val1.equals(val2));
		
		//equals는 기본적으로 주소값비교 부모껄 써서 false
	}
	
}
