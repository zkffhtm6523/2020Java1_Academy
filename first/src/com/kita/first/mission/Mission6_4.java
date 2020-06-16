package com.kita.first.mission;

public class Mission6_4 {
	public static void main(String[] args) {
		int length = 9;
		for (int j = 1; j < length+1; j++) {
			for (int i = 2; i < length+1; i++) {
				System.out.printf("%d * %d = %d /", i, j,(i*j));
			}
			System.out.println();
		}
	}
}
