package com.kita.first.mission;
/*
 * 숫자를 입력:(종료:0)
 * 
 */

import java.util.Scanner;

public class Mission7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result = true;
		int sum = 0;
		
		while (result) {
			System.out.print("숫자를 입력(종료 0) : ");
			int input = sc.nextInt();
			if (input == 0) {
				result = false;
			}
			if (input % 2 == 0) {
				sum += input;
			}
		}
		System.out.println("합계 :"+sum);
		sc.close();
		
	}
	
}
