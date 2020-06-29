package com.kita.first.level5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(),B = sc.nextLong(),C = sc.nextLong();
		
		sc.close();
		if(B >= C) {
			System.out.println(-1);
		} else {
			System.out.println(A/(C-B)+1);
		}
	}
}
