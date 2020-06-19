package com.kita.first.level2;

import java.util.Arrays;

public class ArrCopy {
	public static void main(String[] args) {
		//배열 복사
		int[] arr = { 2, 4, 6, 7, 10 };
		int[] arr2 = new int[arr.length];
		
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = arr[i];
//		}
//
		//주소값 복사 : 같이 변경됨
		arr2 = arr;
		arr2[2] = 66;
		
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
	}
	public static int[] array2(int[] arr) {
		int[] arr2 = arr;
		return arr2;
	}
}
