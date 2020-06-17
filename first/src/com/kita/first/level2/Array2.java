package com.kita.first.level2;

public class Array2 {
	public static void main(String[] args) {
		int	[][] arr = new int[2][3];
		
		int [][] arr2 = {
				{10,20,30},
				{12,13,14,15},
				{1,2}
		};
		int [][][] arr5 = {
				{
					{1,2,3},
					{2,3,4},
				}
		};
		int	[][][] arr3 = new int[3][4][5];
		
		int [] arr4 = new int[60];
		
		System.out.println(arr.length);
		System.out.println(arr2.length);
		
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+", ");
			}
			System.out.println();
		}
		}
	
	}
