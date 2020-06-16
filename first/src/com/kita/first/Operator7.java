package com.kita.first;

public class Operator7 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println((n1 == n2) && (n1 == n3) && (n2 == n3));
		System.out.println((n1 == n2) || (n1 == n3) || (n2 == n3));
		
		//퍼포먼스 높이는 팁 : &&는 false가 높은 것을 앞에 배치, ||는 true가 높은 것을 앞에 배치
	}
}
