package com.kita.first.level3;

public class TvTest3 {
	public static void main(String[] args) {
		Tv [] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
//		값방과 tv배열과 둘다 레퍼런스 변수
		
	}
	//Class 메모리 영역
	/*
	 * 			Class
	 * 	Stack			Heap
	 * tv[] tvArr = 0x1234  |  tv배열 0x1234	
	 * 				--------------> [null|null|null] 각 방 타입에 따라..
	 * 								  ^
	 * 						tvArr[0] = new Tv();
	 * 						|		ox3333 
	 * 								[____]
	 * 								[____]
	 * 								[____]
	 * 
	 * 			Class
	 * Stack			Heap
	 * C
	 * B				C B A   FIFO : 먼저 들어오고 먼저 나옴
	 * A
	 * A부터 쌓임
	 * FILO
	 * 먼저 들어가고 나중나옴
	 * 
	 *Tv tv = new Tv(); 
	 * Stack	Heap			
	 * 			TV				String
	 * 			멤버 필드`				---> '삼''성''필''드'
	 * 			메소드 필드
	 *				------>
	 *
	 *
	 *static붙으면 class 메모리로 올라감
	 */
}
