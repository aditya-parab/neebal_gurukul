package com.day2;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum is "+sum);

	}

}
