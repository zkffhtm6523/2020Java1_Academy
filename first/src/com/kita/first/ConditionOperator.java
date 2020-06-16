package com.kita.first;

public class ConditionOperator {
	//삼항 연산자
	public static void main(String[] args) {
		int num = 4;
		//삼항 연산자
		boolean isOdd = (num % 2 == 1 ? true : false);
		
		String result = (num % 2 == 1 ? "홀수" : "짝수");
		
		System.out.printf("%d is odd? %b\n", num, isOdd);

		System.out.printf("%d is odd? %s\n", num, result);
	}
}
