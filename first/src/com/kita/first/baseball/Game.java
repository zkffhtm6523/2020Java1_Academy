package com.kita.first.baseball;

public class Game {
	public static void main(String[] args) {
		final int GAMECNT = 3;
		Baseball ball = new Baseball(GAMECNT);
		
		MyBall myBall = new MyBall(GAMECNT);
		do {
			myBall.setNumbers();
		} while(Checker.check(GAMECNT, ball, myBall)); {
			
		}
		System.out.println("게임 종료");
	}
}
