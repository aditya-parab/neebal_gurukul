package com.day2;

import java.util.Scanner;

public class Assignment2Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter lower ");
		int lower = sc.nextInt();
		System.out.println("Please enter upper ");
		int upper = sc.nextInt();
//		int lower = 5;
//		int upper = 40;
		int f=0;
		int s =1;
		
		for(int i = 1; ;i++) {
			if(f>=lower && f<upper) {
			System.out.print(f+" ");
			}
			int total = f+s;
			f=s;
			s=total;
			
			if(f>upper) {
				break;}
		}
	}

}
