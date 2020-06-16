package com.kita.first.mission;

public class Practice2 {
	public static void main(String[] args) {
		
		
		double r = Math.random();
		
		
		//0.0000000~0.99999999 => 10을 곱하면 0->9.9999까지 범위임
		//int로 형변환하면 0~9
		int rVal = (int)(r*10)+1;
		int rVal2 = (int)(Math.random() * 16);
		System.out.println(rVal);
		System.out.println(rVal2);
		
		//46~77
		while (true) {
			int rVal3 = (int)(Math.random()*32)+46;
			System.out.println(rVal3);
			if (rVal3 > 77 && rVal3 < 46) {
				break;
			}
		}
	}
}
