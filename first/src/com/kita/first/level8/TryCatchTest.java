package com.kita.first.level8;

import java.lang.ClassNotFoundException;

public class TryCatchTest {
	public static void main(String[] args) {

		System.out.println(div(0, 20));
	}

	public static double div(double n1, double n2) {
		try {
			return n1 / n2;
		//콜백함수 
		} catch (Exception e) {
			return 0;
		}
	}

	public static void meth2() throws Exception {
		Class.forName("dsddd"); // 예외가 발생될 거 같으니까 해결해줘.
		// 예외가 발생해도 메소드 호출 시 try-catch문으로 해결해줘야됨
	}

	public static void meth() {
		// 런타임 에러 발생 시, 서버 죽지 않도록
		// 보통 통신할 때 많이 터짐.
		int result = 0;
		try { // 예외 안 터지면 실행
			result = 10 / 0;

			Class.forName("");
		} catch (ClassNotFoundException e) {

		} catch (Exception e) { // 예외 터지면 실행
			e.printStackTrace(); // 에러 출력 메세지
			System.out.println("예외가 발생하였습니다.");
		} finally { // 터지든 안 터지든 무조건 실행
			System.out.println("finally");
			// 밖에다 적으면 어떻게든 자원 반납 안 할 수도 있음..
			// stream을 반납할 때
			// try or catch에 return이 있어도 실행
		}
		System.out.println("result : " + result);
		System.out.println("종료");

	}
}
