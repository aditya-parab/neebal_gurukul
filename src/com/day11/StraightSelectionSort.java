package com.day11;

import java.util.Arrays;

public class StraightSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {8,15,7,2,11,4};
		for(int i=0;i<a.length-1;i++) {
			int index=i	;
			for(int j=i;j<a.length;j++) {
			
				if(a[index]>a[j]) {
					
					index=j;
							 
				}}
				int t = a[index];
				a[index]=a[i];
				a[i] =t;
			}
		System.out.println(Arrays.toString(a));
			
		}
		
		

	}


