package com.kita.first.mission;

public class Mission6_3 {
	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			for (int i = 9; i < 18; i++) {
				System.out.printf("%d * %d = %d\n", j, (i-8), j*(i-8));
			}
			System.out.println("-----------");
		}
	}
}
