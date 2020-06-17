package com.kita.first.level2;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr = { { 90, 100, 88 }, // 영어
				{ 34, 99, 45 }, // 수학
				{ 98, 65, 87 } }; // 국어
		String[] subject = { "영어", "수학", "국어" };
		/*
		 * 영어 합계 : ?, 평균 : ? 수학 합계 : ?, 평균 : ? 국어 합계 : ?, 평균 : ? 전제 합계 : ?, 평균 : ?
		 */
		int total = 0;
		float totalAvg = 0;
		float avg = 0;
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[i][j];
			}

			total += sum;
			avg = ((float)sum / (float)(arr[i].length));
			totalAvg += avg;
			System.out.printf("%s합계 : %d, %s평균 : %.2f\n", subject[cnt], sum, subject[cnt], avg);
			cnt++;
		}
		totalAvg = (float)total / (float)(arr.length*arr[0].length);
		System.out.printf("전체합계 : %d, 전체평균 : %.2f\n", total, totalAvg);

	}
}
