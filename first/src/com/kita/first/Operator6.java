package com.kita.first;

public class Operator6 {
	public static void main(String[] args) {
		String str1 = new String("안녕");//fm방법
		String str2 = new String("안녕");
		String str3 = str2;
		//레퍼런스 변수는 주소값이 저장됨.
		//일반 변수는 값이 저장됨
		System.out.println(str1 == str2); //주소값 비교
		System.out.println(str3 == str2); //주소값 비교
		System.out.println();
		System.out.println(str1.equals(str2)); //문자열 비교
		System.out.println("안녕".equals(str2)); //문자열 비교.안정적임...
	}
}
