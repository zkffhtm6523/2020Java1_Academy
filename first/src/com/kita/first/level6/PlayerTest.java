package com.kita.first.level6;

public class PlayerTest {
	public static void main(String[] args) {
//		Player player = new Player();
//		abstract클래스라서 객체화 안 됨
		
		Player player = new CDPlayer();
		player.play();
		player.stop();
		
		player = new DVDPlayer();
		player.play();
	}
}
