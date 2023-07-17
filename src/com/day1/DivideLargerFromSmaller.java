package com.day1;

import java.util.Scanner;

public class DivideLargerFromSmaller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1,d2,res;
		
		System.out.print("Please enter first number ");
		d1 = sc.nextInt();
		System.out.print("Please enter second number ");
		d2 = sc.nextInt();
		
		if(d1>d2) {
			res = d1/d2;
		}
		else {
			res = d2/d1;
		}
		System.out.println("The output is "+res);
		
		
	}

}
