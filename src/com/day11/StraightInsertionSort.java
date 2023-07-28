package com.day11;

import java.util.Arrays;

public class StraightInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,7,11,2,9,4};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			int hand = arr[i];
			for(j=i;j>0;j--) {
				if(j>0 && arr[j-1]<hand) {
					arr[j]=arr[j-1];
				}
				else
					break;
				
			}
			arr[j] = hand;
			
			
//			for(int j=0;j<arr.length;j++) {
//				if(arr[j]>arr[i]) {
//					int t = arr[j];
//					arr[j] = arr[i];
//					arr[i] = t;
//				}
//				
//				
//			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
