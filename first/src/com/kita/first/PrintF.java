package com.kita.first;

public class PrintF {
	public static void main(String[] args) {
		int age = 31000000;
		String name = "김도빈";
		float vision = 1.2f;
		char bloodType = 'B';

		System.out.print("나의 이름은 " + name + "입니다. 나의 나이는 " + age + "입니다.\n" + "나의 시력은 " + vision + "입니다. 나의 혈액형은 "
				+ bloodType + "입니다.\n");
		// 모두 다 String으로 변환됨.

		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %,d입니다. 나의 시력은 %.1f입니다.\n"
						+ "나의 혈액형은 %c입니다.", name, age, vision, bloodType);
		/*
		 * %s : 문자열(String)
		 * %d : 10진수 정수(decimal)
		 * %f : 실수(float)
		 * %c : 문자(char)
		 */
		
		char v1 = 'A';
		System.out.printf("\n%c : %d\n",v1,(int)v1);
		
		byte v2 = 66;
		System.out.printf("%c : %d\n", (char)v2,v2);
	}
}
