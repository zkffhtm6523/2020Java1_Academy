package com.kita.first.mission;

import java.util.Scanner;

public class Mission5 {
	/*
	 * 점수를 입력해수세요 : (0~100)
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력해주세요 : ");

		int score = sc.nextInt();
		int gradeA = 90;
		int gradeB = 80;
		int gradeC = 70;
		int mod = score % 10;

		String grade = "";

		if (score > 100 || score < 0) {
			System.out.println("잘못 입력했습니다.");
			return;
		} else if (score >= gradeA) {
			grade = "A";
		} else if (score >= gradeB) {
			grade = "B";
		} else if (score >= gradeC) {
			grade = "C";
		} else {
			grade = "D";
		}

		if (score == 100) {
			grade += "+";
		} else if ("D".equals(grade)) {

		} else if (mod >= 7) {
			grade += "+";
		} else if (mod <= 3) {
			grade += "-";
		}
		sc.close();
		System.out.println(grade);

	}
}
