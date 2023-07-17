package com.day1;

import java.util.Scanner;

public class Assignment1Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yrs,months,weeks,days,input;
		input = sc.nextInt();
		
		yrs = input/(365);
		input = input%365;
		months = input/(30);
		input = input%30;
		weeks = input/7;
		days = input%7;
		System.out.println(yrs+" years");
		System.out.println(months+" months");
		System.out.println(weeks+" weeks");
		System.out.println(days+" days");

	}

}
