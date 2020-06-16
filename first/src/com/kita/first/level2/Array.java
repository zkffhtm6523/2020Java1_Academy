package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
		int [] arr = new int [4]; //레퍼런스 변수임..착각 X
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		char[] arr2 = new char[20];
//		float[] arr3 = new float[10] {ㅇㄻㅁㅎㅇㅎㅁㄹ}; 이렇게 자릿수 선언하면서
//		float arr3 [] => 이렇게도 되는데 객체처럼 되서 , 추천하지 않는다.
		String[]arr4 = new String[200];
		//초기 null값 있음
		System.out.println(arr4[0]);
		//String 배열 안에 String이 각각 객체로 있음.
		
		//boolean 배열은 기본 false
		
		int [] arr5 = {10,20,30,40};
		int [] arr6 = arr5;
		
		System.out.println(arr5); //주소값, C언어처럼 완벽한 주소값은 아님
		System.out.println(arr6); // 주소값 같음.
		
		System.out.println(arr2[0]);
		System.out.println(arr[1]);
		
		//배열 사용 목적 : 변수 사용 줄이기 위해서
		//			: for문 등 반복문 사용 위해서
		
//		--------------------------------------------------
		
		int [] arr7 = new int[100];
		for (int i = 0; i < arr7.length; i++) {
			arr7[i] = 5;
		}
		//length는 final 상수 값, out도 상수
		
		for (int i = 0; i < 100; i++) {	//리터럴 값을 직접 대입하는 것은 지양해야 함
			System.out.println(arr7[i]);
		}
		//한 가지 일만 해야 재사용성이 높아짐
		//나중에 메소드로 전환 시 한 가지 일만 하는 메소드
		
		//arr7.length중 .은 레퍼런스 변수만 사용 가능
		
		//만약에 이미 만들어져있는 배열이 있는데 값을 추가로 더 집어넣고 싶은 경우 배열을 하나 더 만들고
		//for문으로 원래 배열을 복사한 후 if를 사용하든 뭘 하는 원하는 값을 집어넣음
		
		//linked list : 수정시 빠름
		//ArrayList : 수정 시 느림
		
		
		
		
		
		
		
		
		

	}
}
