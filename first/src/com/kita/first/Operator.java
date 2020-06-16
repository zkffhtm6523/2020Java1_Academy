package com.kita.first;

public class Operator {
	public static void main(String[] args) {
		//n1의 값은 변경함
		int n1 = 10;
		n1++;
		System.out.println(n1);
		++n1;
		System.out.println(n1);
		
		//n2의 값은 변경 없음
		int n2 = 10;
		System.out.println(n2 + 1);
	}
}
