package com.day1;

import java.util.Scanner;

public class ThreeDigitReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the 3 digit number: ");
		int digit = sc.nextInt();
		
		int first = digit/100;
		int second = (digit/10)%10;
		int third = digit%10;
		int reversed = (third*100)+(second*10)+first;
		
		System.out.println("The sum of digits is "+(first+second+third));
		System.out.println("The reversed number is "+reversed);
		System.out.println("Sum of the number and its reverse is "+(digit+reversed));
		

	}

}
