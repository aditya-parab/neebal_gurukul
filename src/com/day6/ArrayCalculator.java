package com.day6;

import java.util.Scanner;

public class ArrayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size: ");
		int n = sc.nextInt();
		double [] arr = new double[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the number");
			int val = sc.nextInt();
			arr[i]=val;
		}
		
	
		
		double sum,avg,var,sd;
		
		sum=0;
		var  =0;
		
		
		
		for(double val:arr ) {
			sum+=val;
			
		}
		
		avg = sum/n;
		
		for(double val:arr ) {
			var+=(1.0/n)*Math.pow((val-avg),2);
			
		}
		
		sd = Math.sqrt(var);
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(var);
		System.out.println(sd);
		
		
		
	}

}
