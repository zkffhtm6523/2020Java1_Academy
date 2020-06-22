package com.kita.first.level3;

public class Monitor {
	static String brand; //멤버필드, 클래스 변수
	//static이 붙으면 값이 하나밖에 저장 안됨. 공용
	int inch; //인스턴스 변수
	
	
	void printInfo() {
		System.out.printf("brand : %s, inch : %d\n",this.brand,this.inch);
	}
	
//	static void printInch() {
//		System.out.println(inch);
//	} 
	//static 메소드로 사용하고 싶은데 inch가 static이 아니라서
	//사용 못함. 하려고 하면 inch를 객채화 후 사용해야 함
	
	void printInch() {
		System.out.println(brand);
	}
	
	
	static void printBrand() {
		System.out.println(brand);
	}
}


//언제 static을 붙일까? static을 붙이려고 노력
//멤버필드를 사용하는 메소드는 static을 붙이지 말자.