package com.kita.first.level2;

public class Method4 {
	public static void main(String[] args) {
		System.out.println(sum(3,4,5,6)); 
		sum(5,7,9); // 21
	}
	public static int sum(int ...arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
//	public static void sum(String g, int ...arr) {
//	}
//	public static void sum(int a, int ...arr) {
//	}
}
