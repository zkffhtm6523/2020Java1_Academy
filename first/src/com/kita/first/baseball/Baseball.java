package com.kita.first.baseball;

public class Baseball {

	private int[] rArr;
	int len = 0;

	Baseball() {
	}

	public Baseball(int num) {
		init(num);
	}

	void init(int num) {
		rArr = new int[num];
		setRandom();
	}

	public void setRandom() {
		System.out.println("중복되지 않는 랜덤 값(0~9)");
		int min = 0;
		int max = 9;

		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) ((Math.random() * (max - min) + 1));
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(getrArr()));
	}

	public int[] getrArr() {
		return rArr;
	}

	public int get(int idx) {
		return rArr[idx];
	}

}
