package com.day6;

public class swapHalves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a ;
		a= new int[] {10,11,12,20,21,22,23};
		
		if(a.length%2==0) {
			for(int i=0;i<a.length/2;i++) {
				int j = a.length/2+i;
				int t = a[i];
				a[i]=a[j];
				a[j]=t;
			}}
			else {
				for(int i=0;i<a.length/2;i++) {
					
					int j =a.length/2+1+i;
//					int j = a.length/2+i;
					int t = a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			
			
			
		
		//print the array
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
