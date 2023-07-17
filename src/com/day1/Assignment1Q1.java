package com.day1;

import java.util.Scanner;

public class Assignment1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time,sec,min,hrs;
		System.out.print("Please enter time in milliseconds: ");
		time = sc.nextInt();
//		time=7000234;
		

		hrs = time/(1000*60*60);
		time=time%(1000*60*60);
		min = time/(60*1000);
		time=time%(60*1000);
		sec = time/(1000);
		System.out.println("Time is: "+hrs+":"+min+":"+sec);
		
		

	}

}
