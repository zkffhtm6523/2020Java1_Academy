package com.kita.first.mission;

public class MethodMission3 {
	public static void main(String[] args) {
		int result = abs(10);
		System.out.println(result);
		result = abs(-10);
		System.out.println(result);
	}

	public static int abs(int n1) {
		return (n1 < 0 ? -n1 : n1);
	}

}
