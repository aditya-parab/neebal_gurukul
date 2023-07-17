package com.day1;

import java.util.Scanner;

public class Assignment1Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 digit number ");
		int num = sc.nextInt();
		int first,second,third;
//		int num = 152;
		
		first = num/100;
		second = (num%100)/10;
		third = num%10;
		
		if(Math.pow(first, 3)+Math.pow(second, 3)+Math.pow(third,3) == num) {
			System.out.println("Armstrong number");
			
		}
		
		else {
			System.out.println("Not Armstrong number");
		}

	}

}
