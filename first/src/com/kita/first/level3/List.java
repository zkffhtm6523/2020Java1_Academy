package com.kita.first.level3;import java.util.Arrays;

public class List {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		//리터럴을 4 사용할 수 있고
		//arr = new int[]{1,2,3,4};
		int [] temp = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = arr.length+1;
		arr = temp;
		System.out.println(Arrays.toString(arr));
		
	}
}
