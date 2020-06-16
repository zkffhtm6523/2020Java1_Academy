package com.kita.first;

public class Operator5 {
	public static void main(String[] args) {
		// 비교 연산자 > boolean
		int n1 = 11;
		int n2 = 11;
		boolean result = (n1 == n2);

		System.out.println(result);

		result = (n1 != n2);
		System.out.println(result);

		result = n1 >= n2;
		System.out.println("n1 > n2 : " + result);
		System.out.println("n1 > n2 : " + !result);
		
		//문자열(String)은 == 비교 안 됨..

	}
}
