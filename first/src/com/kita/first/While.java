package com.kita.first;

public class While {
	public static void main(String[] args) {
		//몇 번 반복할 지 알 때
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("-----------");
		
		//몇 번 반복할 지 모를 때 
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}
}
