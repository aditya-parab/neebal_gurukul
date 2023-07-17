package com.day1;

import java.util.Scanner;

public class Assignment1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the time ");
		int input;
		input = sc.nextInt();
		
		int timeHr = input/100;
		int timeMin = input%100;
		
		int time12 = timeHr%12;
		
		System.out.println(time12+":"+timeMin);

	}

}
