package com.kita.first.mission;

public class Mission6_5 {
	public static void main(String[] args) {
		String result = "";
		int star = 4;
		
		for (int i = 1; i <= star*star; i++) {
			System.out.print("*");
			if (i%star == 0) {
				System.out.println();
			}
		}
		
//		****0****0****0****0
	}
}
