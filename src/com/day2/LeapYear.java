package com.day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year ;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		boolean flag=false;
		if(year%400==0 || (year%4==0 && year%100!=0))
			System.out.println("Leap year");
		else {
			System.out.println("Not a leap year");
		}
		
		
		
//		if(year%4==0) {
//			if(year%100 != 0) {
//				flag=true;
//			}
//			else {
//				if(year%400==0)
//					flag=true;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("Leap yr");
//		}
//		else {
//			System.out.println("Not leap year");
//		}

	}

}
