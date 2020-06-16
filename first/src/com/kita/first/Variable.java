package com.kita.first;

public class Variable {
	public static void main(String[] args) {
		//일반 변수(예약어) -> 변수 선언(단 한번만)
		char v1; //문자형, 정수형
		v1 = 'A';
		System.out.println(v1);
		System.out.println('A');
		//홑따옴표는 값, 쌍따옴표는 객체
		
		v1 = 'B';
		System.out.println(v1);
		
		byte v2; // 정수형 // 1바이트
		short v3; // 2바이트
		int v4; //int만 잘 사용하면 됨. 4바이트, int가 속도 제일 빠름
		//cpu, os는 메모리는 64비트지만 처리 단위는 32비트임
		long v5; //8바이트
		
		//오버플로우
		//강제 형변환 필요할 시 주석 필요
		//자동 형변환 : 작은 곳에서 큰 곳으로 갈 때
		v3 = 20;
//		v2 = (byte)v3;
//		v2 = (byte)128; //128은 byte단위에서 값 초과로 안 들어감
		v2 = 127;
		v4 = 30;
		v5 = 50;
		System.out.println();
		System.out.println(v2 + 5);
		//숫자 5는 int라서 int로 자동 형변환
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		float v6; //실수형
		v6 = (float)10.1; //실수는 자동적으로 double로 잡혀서
		v6 = 10.1f;
		v6 = 10.1F;
		//10.1의 리터럴 값은 double이기 때문에 float로 강제 형변환 필요함
		
		
		double v7;
		v7 = 10.1;
		//메모리 할당이 아닌 지수법. double : 범위가 넓을 수록 더 정확함
		//float는 4바이트라서 속도는 더 빠름
		
		//리터럴값 : 고유값 Byte의 단위 사이는 리터럴
		//쇼트값 : 단위 초과 시
		
		v6 = (float)v7;
		
		boolean v8; //논리형
		
		System.out.println();
		v8 = true;
		System.out.println(v8);
		
		v8 = false;
		System.out.println(v8);
		
		//레퍼런스 변수(나머지)
		String r1 = "안녕하세요.";
		System.out.println(r1);
		Variable r2; // 방금 만든 클래스
	}
}
