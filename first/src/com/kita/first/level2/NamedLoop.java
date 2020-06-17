package com.kita.first.level2;

public class NamedLoop {
	public static void main(String[] args) {
		
		Parant:
		for (int i = 0; i < 10; i++) {
			Parent2:
			for (int j = 0; j < 20; j++) {
				if (j == 15) {
					break Parant;
//					continue Parent;
//					break; 둘이 같음
				}
				System.out.printf("%d - %d\n", i, j);
			}
		}
	}
}
