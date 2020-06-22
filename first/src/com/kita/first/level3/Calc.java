package com.kita.first.level3;

public class Calc {
	int n1 = 0;
	int n2 = 0;
	public static int sum(int n1, int n2) {
		return n1 + n2;
	} 
	
	public int sum() {
		return this.n1 + this.n2;
	}
	//this는 객체화가 되어야 한다.
	
	
//	public static int sum2(int n1, int n2) {
//		return Calc.n1 + Calc.n2;
//	} n1과 n2가 static이라면 클래스로 접근
}
