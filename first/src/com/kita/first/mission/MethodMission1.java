package com.kita.first.mission;

public class MethodMission1 {
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			guguDan(i);
//		}
		guguDan(4, 7);
	}

	public static void guguDan(int dan) {
		int gugudanLength = 9;
		for (int i = 1; i <= gugudanLength; i++) {
			System.out.printf("%d * %d = %d\n", dan, (i), dan * (i));
		}
		System.out.println("----------");
	}

	// 오버로딩. 파라미터가 달라져야함
	public static void guguDan(int sDan, int eDan) {
		for (int i = sDan; i <= eDan; i++) {
			guguDan(i);
		}
	}
}
