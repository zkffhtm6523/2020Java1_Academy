package com.kita.first.mission;

public class Mission6_2 {
	public static void main(String[] args) {
//		for (int i = 0; i < star; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
		int star = 10;
		for (int j = 0; j < star; j++) {
			System.out.println();
			for (int i = 0; i < star; i++) {
				System.out.print(i < j?" ":" *");
			}
		}
		for (int j = 0; j < star+1; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i < star-(j)?" ":" *");
			}
			System.out.println();
		}
		for (int j = 0; j < star; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i < j?" ":" *");
			}
			System.out.println();
		}
		for (int j = 1; j < star+1; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i < star-(j)?" ":" *");
			}
			System.out.println();
		}
		for (int j = 0; j < star; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i < j?" ":" *");
			}
			System.out.println();
		}
		for (int j = 1; j < star+1; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i < star-(j)?" ":" *");
			}
			System.out.println();
		}
		for (int j = 0; j < star; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i < j?" ":" *");
			}
			System.out.println();
		}
		for (int j = 1; j < star+1; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i < star-(j)?" ":" *");
			}
			System.out.println();
		}
		/*
		 * 000000000*
		 * 00000000**
		 * 0000000***
		 *     6  7 8 9 10    
		 */
//		for (int i = 0; i < star+1; i++) {
//			System.out.println();
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//		}
//		for (int j = 0; j < star; j++) {
//			System.out.println();
//			for (int i = 0; i < star-j; i++) {
//				System.out.print("*");
//			}
//		}
	}
}
