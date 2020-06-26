package com.kita.first.baseball;

public class Checker {
	
	static int cnt = 1;
	//S:0 / B : 0 / O : 0
	//성공하면 false,
	public static boolean check(int len, Baseball b, MyBall mb) {
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		for (int i = 0; i < b.getrArr().length; i++) {
			for (int j = 0; j < b.getrArr().length; j++) {
				if (b.get(i) == mb.get(j)) {
					if (i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		
		out = len - strike - ball;
		System.out.printf("----%d회----\n",cnt);
		System.out.printf("스트라이크 : %d\n",strike);
		System.out.printf("볼 : %d\n",ball);
		System.out.printf("아웃 : %d\n",out);
		System.out.println("-----------");
		cnt++;
		return strike != len;
	}
}
