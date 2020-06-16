package com.kita.first.mission;

import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 10;
		int max = 100;
		int lotto = (int) (Math.random() * (max - min + 1) + min);

		while (true) {
			System.out.print("값 입력 : ");
			int input = sc.nextInt();
			
			if (input < min || input > max) {
				System.out.printf("%d~%d 사이 값을 입력하세요\n",min,max);
				continue; //pass로 이해하자. 아래것 패스 후 위에 다시 시작
			}
			if (input < lotto) {
				System.out.println("up");
			} else if (input > lotto) {
				System.out.println("down");
			} else {
				break;
			}

		}
		sc.close();
		System.out.println("Great!");
	}
}
