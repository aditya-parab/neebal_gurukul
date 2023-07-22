package com.day6;

public class interchangeLargeWithSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = new int [] {10,11,12,20,21,22};
		
		int max,maxIndex,min,minIndex;
		maxIndex=0;
		minIndex=0;
		max = x[0];
		min=x[0];
		for(int i=0;i<x.length;i++) {
			if (x[i]>max){
				max=x[i];
				maxIndex =i;
			}
			if(x[i]<min){
			min=x[i];	
			minIndex = i;
			}
		}
		
		int t = x[maxIndex];
		x[maxIndex]=x[minIndex];
		x[minIndex]=t;
		
		//print the array
				for(int i=0;i<x.length;i++) {
					System.out.print(x[i]+" ");
				}
	}

}
