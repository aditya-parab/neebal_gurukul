package com.day1;

import java.util.Scanner;

public class Assignment1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a1,a2,a3;
		a1 = sc.nextInt();
		a2=sc.nextInt();
		a3 = sc.nextInt();
		int larger;
		
		if(a1>a2) {
			larger=a1;
		}
		else {
			larger = a2;
		}
		
		if (larger>a3) {
			System.out.println(larger);
		}
		else {
			System.out.println(a3);
		}
		
		
//		if (a1>a2) {
//			if(a1>a3) {
//				System.out.println(a1);
//			}
//			else {
//				System.out.println(a3);
//			}
//		}
//		else {
//			if(a2>a3) {
//				System.out.println(a2);
//			}
//			else {
//				System.out.println(a3);
//			}
//		}

	}
	
	

}
