package com.kita.first.baseball;

public class Checker {
	
	//S:0 / B : 0 / O : 0
	//성공하면 false,
	public static boolean check(int len, Baseball b, MyBall mb) {
		boolean result = true;
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		for (int i = 0; i < b.getrArr().length; i++) {
			for (int j = 0; j < i; j++) {
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
		if (out == len) {
			result = false;
		}
		return result;
	}
}
