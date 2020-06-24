package com.kita.first.level3;

import java.util.Arrays;

/*
 * public은 파일명과 똑같은 클래스에 붙여야함
 * 
 */
public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(Arrays.toString(list.arr));
//		list.remove(2);
		list.add(2, 25);
		System.out.println(Arrays.toString(list.arr));
		int delVal = list.remove();
		System.out.println(delVal);
	}
}

class MyList{
	public int[] arr;
	
	MyList() {
		init();
	}
	
	void add(int idx, int num) {
		int[] temp = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			temp[(i < idx) ? i : i +1 ] = arr[i];
		}
		//1번 방법
//		for (int i = 0; i < temp.length; i++) {
//			temp[i] = (i < idx) ? arrGet(i) : arrGet(i-1);
//		}
		//2번 방법
//		for (int i = 0; i < arr.length; i++) {
//			if(i<idx) {
//				temp[i] = arr[i];
//			} else {
//				temp[i + 1] = arr[i];
//			}
//		}
		temp[idx] = num;
		arr = temp;
//		arr = temp;
//		arr[idx] = num;
	}
	void add(int num){
//		int[] temp = new int[arrSize()+1];
//		for (int i = 0; i < arrSize(); i++) {
//			temp[i] = arrGet(i);
//		}
//		temp[arr.length] = num;
//		arr = temp;
		add(arr.length,num);
	}
	private void init() {
		arr = new int[0];
	}
	
	int arrSize() {
		return arr.length;
	}
	
	int arrGet(int idx) {
		return arr[idx];
	}
	
	//마지막이 지워짐..배열 2개
	int remove(int idx) {
		int[] temp = new int[arr.length-1];
	//	for (int i = 0; i < idx; i++) {
	//		temp[i] = arrGet(i);
	//	}
	//	for (int i = idx+1; i < arrSize(); i++) {
	//		temp[i-1] = arrGet(i);
	//	}
	//	arr = temp;
	for (int i = 0; i < temp.length; i++) {
		temp[i] = (i < idx) ? arrGet(i): arrGet(i+1);
	}
	int delVal = arr[idx];
	arr = temp;
	return delVal;
	}
    int remove() {
    //	int[] temp = new int[arrSize()-1];
    //	int value = arrGet(arr.length-1);
    //	for (int i = 0; i < temp.length; i++) {
    //		temp[i] = arrGet(i);
    //	}
    //	arr = temp;
    //	return value;
    	return remove(arr.length-1);
}
}
