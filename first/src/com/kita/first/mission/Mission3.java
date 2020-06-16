package com.kita.first.mission;

import java.util.Scanner;

public class Mission3 {
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

		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		if ("남".equals(gender)) {
			if (height > 160) {
				System.out.println("평균 초과");
			} else if(height == 160){
				System.out.println("평균");
			} else {
				System.out.println("평균 미만");
			}
		}else if("여".equals(gender)) {
			if (height > 150) {		//리터럴 값을 바로 받는 것은 안 좋다
				System.out.println("평균 초과");
			} else if(height == 150){
				System.out.println("평균");
			} else {
				System.out.println("평균 미만");
			}
		} else {
			System.out.println("성별을 잘못 입력했습니다.");
		}
		sc.close();
		

	}
}
