package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission2 {
	/*
	 * 1. 사이다(500원) 2. 콜라(600원) 3. 환타(700원) 4. 마운틴듀(800원) 5. 초코우유(400원) 6.
	 * 바나나우유(400원) 0.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] drink = { "사이다", "콜라", "환타", "마운틴듀", "초코유유", "바나나우유" };
		int[] price = { 500, 600, 700, 800, 400, 400 };
		
		//종료 로직 시 false 대입하기 위한 변수
		boolean run = true;
		//종료 변수
		int ex = 0;
		//합계 변수
		int sum = 0;
		
		while (run) {
			System.out.print("메뉴를 선택하세요(종료 0) : ");
			int num = sc.nextInt();
			//메뉴 선택 로직
			if (num > ex && num < drink.length + 1) {
				System.out.printf("%s %d원 \n", drink[num - 1], price[num - 1]);
				//합계 로직
				sum += price[num - 1];
			//종료 로직
			} else if (num == ex) {
				run = false;
			//숫자 범위 초과 시
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.printf("종료, 총 %,d원 사용", sum);
		sc.close();
	}
}
