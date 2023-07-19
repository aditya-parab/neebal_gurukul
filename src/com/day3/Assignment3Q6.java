package com.day3;

import java.util.Scanner;

public class Assignment3Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		
		System.out.println("enter start: ");
		int start=sc.nextInt();

		
//		int n =5;
//		int start = 8;
		int f=0;
		int s =1;
		while(n>0) {
			if(f>=start) {
				System.out.print(f+" ");
				n-=1;
			}
			int total = f+s;
			f=s;
			s=total;
			
			
			
		}
	}

}
