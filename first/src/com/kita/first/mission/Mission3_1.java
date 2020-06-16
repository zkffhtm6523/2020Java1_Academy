package com.kita.first.mission;

import java.util.Scanner;

public class Mission3_1 {
	/*
	 * 성별을 입력하세요 : 
	 * 키를 입력하세요 : 
	 * 
	 * 남자 기준 : 160
	 * 여자 기준 : 150
	 * 
	 * "평균 미만입니다."
	 * "평균입니다.
	 * "평균 초과입니다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별(남,여) : ");
		String gender = sc.next();

		
		if ("남".equals(gender) || "여".equals(gender)) {
			System.out.print("키 : ");
			int height = sc.nextInt();

			int standHeight = 150;
			
			if ("남".equals(gender)) {
				standHeight = 160;
			} 
			
			if (height > standHeight) {
				System.out.println("평균 초과입니다.");
			} else if (height < standHeight) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		} else {
			System.out.println("성별을 잘못 입력했습니다.");
		}
		sc.close();
	}
}
