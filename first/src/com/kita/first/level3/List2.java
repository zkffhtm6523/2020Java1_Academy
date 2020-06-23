package com.kita.first.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Object형으로 난잡하게 데이터를 넣을 수 있으니 제네릭 클래스로 입력 형식 제한
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0, 11);
		
		list.remove(list.size() -1); // 마지막꺼 삭제한다는 뜻
		
		int[] arr = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			
//			int val = (int)list.get(i);
//			System.out.print(val+", ");
			//값을 배열에 담는 방법
			arr[i] = (int)list.get(i);
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		//foreach문은 index를 사용하지 못한다
		int i = 0;// 복잡해짐
		for (Object val : list) {
			System.out.print((int)val + ", ");
			System.out.printf("i : %d, %d / ", i++, val);
		}
		
		/* arraylist는 기본적으로 object형으로 저장 및 리턴
		 * 변수 저장 타입으로 강제형변환 필요
		 * 
		 */
		
	}
}
