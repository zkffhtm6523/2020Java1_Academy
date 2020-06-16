package com.kita.first.level2;

public class ArrayOrder3 {
	public static void main(String[] args) {
		// 버블 정렬 : 끝에서부터 정렬됨.
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j+1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
