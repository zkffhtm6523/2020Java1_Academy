package com.kita.first.mission;

public class Mission6_1 {
	//구구단
	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			for (int i = 9; i < 18; i++) {
				System.out.printf("%d * %d = %d\n", j, (i-8), j*(i-8));
			}
			System.out.println("-----------");
		}
	}
}
