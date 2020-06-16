package com.kita.first.mission;

public class Mission9 {
	
	/*
	 *  arr 1~100값이 들어가도록
	 *  0번 방에 1
	 *  99번 방에 100
	 */
	
	public static void main(String[] args) {
//		int [] arr = new int [100];
//		int sum = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] += (i+1)*2;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		
//		System.out.printf("합계 : %,d",sum);
		int [] arr = new int [10];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += (i+1)*2;
//			if (i == (arr.length-1)) {
//				System.out.print(arr[i]);
//			} else {
//				System.out.print(arr[i]+", ");
//			}
//			if (i == 0) {
//				System.out.print(arr[i]);
//			} else {
//				System.out.print(", "+arr[i]);
//			}
//			-----------------------
			System.out.print(arr[i]);
			if ( i< arr.length-1) {
				System.out.print(", ");
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.printf("\n합계 : %,d",sum);
	}
	
}
