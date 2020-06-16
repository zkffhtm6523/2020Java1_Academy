package com.kita.first;

public class Operator2 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		
		int result = n1++; // n1의 값 올리기 전 대입하고 n1증가
		System.out.println("result : "+result);
		System.out.println("n1 : "+n1);
		
		int result2 = ++n2;// n2의 값 올리고 대입하고 n2증가
		System.out.println("result2 : "+result2);
		System.out.println("n2 : "+n2);
	}
}
