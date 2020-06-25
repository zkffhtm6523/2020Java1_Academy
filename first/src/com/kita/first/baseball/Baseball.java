package com.kita.first.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {
	
	private int[] rArr;
	int len = 0;
	
	Baseball() {}
	
	public Baseball(int num){
		init(num);
	}
	
	void init(int num) {
		rArr = new int[num];
		setRandom();
	}
	
	public void setRandom() {
		System.out.println("중복되지 않는 랜덤 값(0~9)");
		int min = 0;
		int max = 9;

		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) ((Math.random() * (max - min)+1));
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(getrArr()));
	}

	public int[] getrArr() {
		return rArr;
	}

	public int get(int idx) {
		return rArr[idx];
	}
	
	
	
	
	
	
	
	public void exe() {
		Scanner sc = new Scanner(System.in);

		System.out.println("중복되지 않는 랜덤 값(0~9)");
		int[] myArr = new int[len];
		int min = 0;
		int max = 9;

		int strike = 0;
		int ball = 0;
		int out = 0;
		int cnt = 0;
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) ((Math.random() * (max - min)));
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
		// 검산식
//		for (int i = 0; i < myArr.length; i++) {
//			System.out.print(rArr[i] + " ");
//		}
//		System.out.println();
		while (strike < 3) {
			++cnt;
			System.out.println("--------------");
			System.out.println(cnt+"회 시도중");
			strike = 0;
			ball = 0;
			out = 0;
			for (int j = 0; j < myArr.length; j++) {
				System.out.printf("값%d : ", (j + 1));
				myArr[j] = sc.nextInt();
				// 스트라이크 찾기
				if (myArr[j] == rArr[j]) {
					strike += 1;
				}
			}
			// 볼 찾기
			for (int i = 0; i < myArr.length; i++) {
				for (int j = 0; j < myArr.length; j++) {
					if (myArr[i] == rArr[j] && myArr[i] != rArr[i]) {
						ball+=1;
					} 
				}
			}
			
//			for(int i=0; i<myArr.length; i++) {
//				myArr[i] = sc.nextInt();
//				for(int j=0; j<myArr.length; j++){
//					if(rArr[i]==myArr[j]) {
//						if(i==j) {
//							strike++;
//						}else {
//							ball++;
//						}
//					}
//				}
//			}
			// 아웃 찾기
			out = len - strike - ball;
			
			
//			for (int i = 0; i < myArr.length; i++) {
//				System.out.print(myArr[i] + " ");
//			}
			
			System.out.println("Strike : " + strike);
			System.out.println("Ball : " + ball);
			System.out.println("Out : " + out);
			sc.close();
	}
	
}
}
