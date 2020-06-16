package com.kita.first;

/*
 * Switch 사용 상황
 * 1. 문자열 비교 시/ equals 사용 안 해도 되서 편함
 * 2. 비교문 사용 못함.
 */


public class Switch {
	public static void main(String[] args) {
		int num = 3;

		switch (num) { //폭포수와 같음
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2이다");
			break;
		case 3:
			System.out.println("3이다");
			break;
		case 4 : case 6 : System.out.println("짝수이다"); break;
			//약간의 범위까지 됨
		default://옵션, if문의 else같은 것
			System.out.println("1~3이 아니다");
			break;
		}
	}
}
