package com.kita.first;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		java.util.Scanner scan = new java.util.Scanner(System.in); FM방식
		// 메모리에 올리는 행위/
		// new : 메모리에 올리는 행위
		System.out.print("Age : ");
		int age = sc.nextInt();
		System.out.println("Age : " + age);
		
		System.out.print("이름? : ");
		String name = sc.next();
		System.out.println("이름 : "+name);
		
		sc.close();
	}
}
