package com.day2;

import java.util.Iterator;
import java.util.Scanner;

public class ProgressionsSum {

	public static void main(String[] args) {
		
		double sum1,sum2,sum3,sum4,sum5;
		// First
		sum1=0;
		Scanner sc = new Scanner(System.in);
//		int n= sc.nextInt();
		
//		for(int i =1; i<= n; i++) {
//			sum1+=(1.0/i);
//			
//		}
//		System.out.println(sum1);
		
		
		//Second
//		sum2 =0;
//		double prod=1;
//		for(int i=1; i<=n; i++) {
//			prod =Math.pow(i,2);
//			
//			sum2 += 1.0/prod;
//		}
//		System.out.println(sum2);
		
		//third
//		sum3 =0;
//		double prod=1;
//		for(int i=1;i<=n;i++) {
//			prod*=i;
//			System.out.println(prod);
//			sum3 += 1.0/prod;
//		}
//		System.out.println(sum3);
		
		//Fourth
		sum4=0;
//		int n=10;
//		double denom=1;
//		double prod=1.0;
//		int sign=1;
//		for(int i=1;i<=n*2;i++) {
//			prod*=i;
//			if(i%2!=0) {
//				sum4+=sign*1.0/prod;
//				sign=-sign;
//			}
//			
//		
//		}
//		System.out.println(sum4);
		
		//Fifth
		sum5 =0;
		int n=10;
		double num=60;
		num = Math.toRadians(num);
		double prod=1.0;
		int sign=1;
		for(int i=1;i<=n*2;i++) {
			prod*=i;
			if(i%2!=0) {
				sum5+=sign*(Math.pow(num,i))/prod;
				sign=-sign;
			}
		}
		System.out.println(sum5);
		

		
		
	}

}
