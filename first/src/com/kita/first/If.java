package com.kita.first;

public class If {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;

		if (n1 > n2) {// 괄호 안에 올 수 있는 건 boolean
			System.out.println("n1이 n2보다 크다!");
		} else if (n1 == n2) {
			System.out.println("n1이 n2와 같다!");
		} else {
			System.out.println("n1이 n2보다 작다!");
		}
		System.out.println("끝!!");
		//플랫하게 프로그래밍하는 기법
	}
}
