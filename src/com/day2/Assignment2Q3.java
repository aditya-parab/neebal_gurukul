package com.day2;

import java.util.Scanner;

public class Assignment2Q3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the x term: ");
		double x = sc.nextDouble();
		int n=50;
		double sum=0;
		double prod = 1.0;
		for(int i=1; i<=n;i++) {
			prod*=i;
			sum+=(Math.pow(x,i))/(prod);
		}
		System.out.println(sum+1);

	}

}
