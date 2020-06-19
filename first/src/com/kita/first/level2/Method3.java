package com.kita.first.level2;

public class Method3 {
	public static void main(String[] args) {
		System.out.printf("sum : %s\n",sum(25,20));
		System.out.printf("minus : %d\n",minus(25,20));
		System.out.println();
	}

	public static String sum(int n1, int n2) {
		return n1 + n2+"";
//		return String.valueOf(n1+n2);
//		return ""+n1+n2; // 무식한 방법
	}
	//비void형은 return이 있어야됨.
	public static int minus(int n1, int n2) {
		if (n1 > 10) {
			return n1 - n2;
		} return 0;
	}
}
