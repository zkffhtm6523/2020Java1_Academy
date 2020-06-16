package com.kita.first;

public class Operator3 {
	public static void main(String[] args) {
		int n1 = 10;
		n1 = n1 + 1;
		System.out.println("n1 : "+n1);
		
		int n2 = 10;
		n2 = n2 + 2;
		System.out.println("n2 : "+n2);
		
		//정석 방법
		
		int n3 = 30;
		int rate = 3;
		n3 = n3 + rate; //서술형
		n3 += rate; //단축형
		n3 += (-rate);//음수 시 가독성 UP
		
		n3 *= (-2);
		
	}
}
