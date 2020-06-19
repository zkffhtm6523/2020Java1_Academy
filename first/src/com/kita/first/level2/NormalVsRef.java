package com.kita.first.level2;

public class NormalVsRef {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("before num : "+num);
		changeVal(num);//메소드의 매개변수 변경을 했는데
		System.out.println("after num : "+num);
		//바뀌지 않음
		
		int[] numArr = {10}; //배열은 레퍼런스 변수, 주소값을 저장함
		System.out.println("before numArr[0] : "+numArr[0]);
	
		changeVal(numArr);
		System.out.println("before numArr[0] : "+numArr[0]);
	}
	
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
		//매개변수로 주소값을 받고, 주소값에 30을 넣음
	}
	public static void changeVal(int num) {
		num = 30;
	}
}
