package com.kita.first.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner sc;

	MyBall() {
	}

	public MyBall(int num) {
		init(num);
	}

	private void init(int num) {
		myArr = new int[num];
		sc = new Scanner(System.in);

	}

	public void setNumbers() {
		int min = 1;
		int max = 9;
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("숫자%d : ", (i + 1));
			String val = sc.nextLine();
			try {
				myArr[i] = Integer.parseInt(val);
			} catch (Exception e) {
				myArr[i] = 0;
			} 
			if (myArr[i] == 0) {
				i--;
				System.out.println("숫자만 입력하세요.");
				continue;
			}
			if (myArr[i] < min || myArr[i] > max) {
				System.out.println("범위 초과");
				i--;
				continue;
			}
			
			for (int j = 0; j < i; j++) {
				if (myArr[i] == myArr[j]) {
					System.out.println("값 중복");
					i--;
					break;
				}
				
			}
		}
		System.out.println(Arrays.toString(myArr));
	}

	public int get(int idx) {
		return myArr[idx];
	}
}
