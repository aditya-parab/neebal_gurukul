package com.day2;

import java.util.Scanner;

public class basePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the base: ");
		int base = sc.nextInt();
		System.out.print("Please enter the power: ");
		int pow = sc.nextInt();
		int total=1;
		for(int i=1;i<=pow;i++) {
			total*=base;
		}
		System.out.println("ans is "+total);
	}

}
