package com.kita.first.mission;

public class Practice3 {
	public static void main(String[] args) {
		int len = 9;
		int[] arr = new int[len];
		//잘 된지 확인하려면 랜덤값과 길이 값을 똑같게
		//길이보다 1개 크게 하면, 무한 루프
		
		for (int i = 0; i < len; i++) {
			//랜덤 값 초기화
			int r = (int) ((Math.random() * 9) + 1);
			arr[i] = r;
			System.out.printf("바깥 for문 : arr[%d] : %d\n",i,arr[i]);
			//j < i이라서 0, 0이 작동 안함
			for (int j = 0; j < i; j++) {
				System.out.printf("안쪽For문 : i : %d, j : %d, arr[%d] : %d, arr[%d] : %d\n"
						,i,j,i,arr[i],j,arr[j]);
				if (arr[i]==arr[j]) {
					System.out.printf("중복제거 : i : %d, j : %d, arr[%d] : %d, arr[%d] : %d\n"
							,i,j,i,arr[i],j,arr[j]);
					i--;
					break; // 제일 가까운 반복문 종료
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
