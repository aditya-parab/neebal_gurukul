package com.day16;

import java.util.ArrayList;

public class interchangeRowWithMinElemAndRowWithMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = {{1,2,3,4},{5,6,7},{8,9,10}};
		int maxRow=0;
		int minRow = 0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>=max) {
					max = a[i][j];
					maxRow=i;	
				}
				if(a[i][j]<=min) {
					min = a[i][j];
					minRow=i;	
				}
			}
	}
		
		int [] t = a[minRow];
		a[minRow] = a[maxRow];
		a[maxRow] = t;


	}}
