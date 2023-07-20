package com.day3;

public class Assignment3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5-i;j>=1;j--) {
				System.out.print("_");
			}
			if(i==1)
			System.out.print("_");
			System.out.print("*");
			
			
			for(int j=i;j>=2;j--) {
				System.out.print("_");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("_");
			}
		if(i>=2)
			System.out.print("*");
		
		
			System.out.println();
		}
		
		//lower half
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("_");
				
			}
//			if(i==5)
//			System.out.println("_");
			
			
			if(i!=5)
			System.out.print("*");
			 if(i==5) {
				System.out.println("*");
			}
			
			for(int j=5-i;j>=1;j--) {
				System.out.print("_");
			}
			for(int j=5-i;j>=1;j--) {
				System.out.print("_");
			}
			
	
			if(i!=5) {
			
			System.out.print("*");
			}
			



			System.out.println();
		}

	}

}
