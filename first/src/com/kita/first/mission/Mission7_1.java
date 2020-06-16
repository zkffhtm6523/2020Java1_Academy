package com.kita.first.mission;

public class Mission7_1 {
	/*
	 * while문을 사용하여
	 * 1~100을 모두 더한 값이 출력되도록 하세요
	 */
	public static void main(String[] args) {
		
		int i = 0;
		float sum = 0;
		while (i < 101) {
			sum += i;
		}
		System.out.printf("합계 : %,.1f",sum);
	}
}
