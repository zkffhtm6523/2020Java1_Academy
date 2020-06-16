package com.kita.first;

public class Variable3 {
	public static void main(String [] args) {
		int n1 = 2147483647;
		long n4 = 222222;
		float n2  = n4;//자동형변환 후 값 대입, 지수계산법으로 적용
		double n3 = n2;
		
		float result = n2 + n1;//n2는 float, n1은 int임.
		int result2 = (int)n2 + n1;//n2는 float, n1은 int임.
		
		System.out.println(n1);
		System.out.println(n2);
	}
}
