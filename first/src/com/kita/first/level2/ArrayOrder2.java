package com.kita.first.level2;

public class ArrayOrder2 {
	public static void main(String[] args) {
		// 선택 정렬 > 순차정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };

//		int temp = 0;
//		int minIndex = 0;
//		for (int i = 0; i < arr.length-1; i++) {
//
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] < temp) {
//					minIndex = j;
//				}
//			}
//			temp = arr[i];
//			arr[i] = arr[minIndex];
//			arr[minIndex] = temp;
//		}
		
		int least;
		for (int i = 0; i < arr.length-1; i++) {
			least = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[least] > arr[j]) {
					least = j;
				}
			}
			if(least != i) {
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
