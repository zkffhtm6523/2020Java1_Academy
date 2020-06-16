package com.kita.first.level2;

public class ArrayOrder {
	public static void main(String[] args) {
//		int[] arr = {29,33,15};
		int[] arr = {29,33,15,88,5,46,92,1,19};
		
		int temp = 0;
		
		//상호 값바꾸기 알고리즘
		
//		temp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = temp;
		
//		System.out.println("arr[0] : "+arr[0]);
//		System.out.println("arr[1] : "+arr[1]);
		//순차 정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
			}
		}
		/*
		 *  29,33,15,88,5,46,92,1,19
			29 33
			33 29
			33 29 15
			88 29 15 33
			92 29 15 33 5 46 88 1 19
			-----------------------------
			   88
			      46 
			          33  
			              29
			---------------------------- 
		 * 
		 * 
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//정렬 알고리즘
		//버블 정렬 : 인접한 변수를 검사하여 정렬하는 방법
		//선택 정렬 : 제자리 정렬 알고리즘의 하나로, 다음과 같은 순서로 이루어진다. 주어진 리스트 중에 최소값을 찾는다.
		//그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)). 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다
	}
}
