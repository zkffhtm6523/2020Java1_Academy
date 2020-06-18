package com.kita.first.mission;

public class MethodMission2 {
	public static void main(String[] args) {
//		printStar(6);
//		//******
//		printStar(3);
//		//***
		final int CNT = 5;
		printStarTriangleDecrease(CNT);
		printStarTriangleDecreaseReverse(CNT);
		printStarSquere(CNT);
		printStarTriangleReverse(CNT);
		printsStarTriangleIncrease(CNT);
	}
	// 별찍기 우측 삼각형
	public static void printStarTriangleDecreaseReverse(int star) {
		for (int i = star; i >0; i--) {
			for (int j = 0; j < star; j++) {
				System.out.print(i>=star-j?" *":"  ");
			}
			System.out.println();
		}
	}

	// 별찍기 메소드
	public static void printStar(int star) {
		for (int i = 1; i <= star; i++) {
			System.out.print(" *");
		}
		System.out.println();
	}

	// 별찍기 사각형
	public static void printStarSquere(int star) {
		for (int i = 1; i <= star; i++) {
			printStar(star);
		}
	}

	// 별찍기 삼각형 증가형
	public static void printsStarTriangleIncrease(int star) {
		for (int i = 1; i <= star; i++) {
			printStar(i);
		}
	}

	// 별찍기 삼각형 감소형
	public static void printStarTriangleDecrease(int star) {
		for (int i = star; i > 0; i--) {
			printStar(i);
		}
	}

	// 별찍기 삼각형 반대
	public static void printStarTriangleReverse(int star) {
		for (int j = 1; j < star + 1; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i < star - (j) ? "  " : " *");
			}
			System.out.println();
		}
	}

	// 별찍기 삼각형 반대2
	public static void printStarTriangleReverse2(int star) {
		for (int j = 1; j < star + 1; j++) {
			for (int i = 0; i < star; i++) {
				System.out.print(i > star - (j) ? "  " : " *");
			}
			System.out.println();
		}
	}
}
