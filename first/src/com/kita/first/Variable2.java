package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 10;
		int num2, num3 = 20;
		int num4 = 10, num5 = 20;
		
		/* - 변수명 주의사항!
		 * 1. 소문자 시작!! (가능한 카멜케이스 기법 사용) int myMaxHeight;
		 * 2. 특수기호는 _(언더바), $(달러)만 사용 가능- 특수기호로 시작해도 무방!
		 * 3. 첫 시작 시 숫자로 X
		 * 4. 예약어(보라색) 사용 금지!
		 * 5. 변수명 띄우면 안됨
		 * 6. 대소문자를 가린다.
		 */
		//리터럴과 상수는 다름
		//변수 vs 상수
		
		final int MY_MAX_HIEGHT; //변할 수 없기 때문에 상수임
		MY_MAX_HIEGHT = 1_000_000; // 지역변수는 되지만 전역변수는 안 됨. 
		System.out.println(MY_MAX_HIEGHT);
		// 7. 상수명은 무조건 대문자, 구분은 언더바로 한다.
		// 전역 변수 : 클래스 바로 밑에 있는 변수. 메소드 벗어난 변수
	}
}
