package com.kita.first.level3;

public class Monitor2 {
	String brand; //멤버필드, 클래스 변수
	int inch; //인스턴스 변수
	static int cnt;
	
	public Monitor2(String brand, int inch) {
		cnt++;
		this.brand = brand;
		this.inch = inch;
	}
	
	void printInfo() {
		System.out.printf("brand : %s, inch : %d",this.brand,this.inch);
	}

}
