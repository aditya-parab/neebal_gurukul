package com.day2;

import java.util.Scanner;

public class Assignment2Q2 {
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("What is the angle in degrees?: ");
		double num = sc.nextDouble();
		double sum =0;
		int n=10;
//		double num=90;
		num = Math.toRadians(num);
		double prod=1.0;
		int sign=1;
		for(int i=0;i<=n*2;i++) {
			
			prod*=i;
			if(i==0)
				prod=1.0;
			if(i%2==0) {
//				System.out.println(i);
				sum+=sign*(Math.pow(num,i))/prod;
				sign=-sign;
			}
		}
		
		if(Math.toDegrees(num)== 90)
			sum=0;
			
		System.out.println("The answer is  "+sum);
	}
}
