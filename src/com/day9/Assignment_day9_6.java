package com.day9;

import java.util.Scanner;

public class Assignment_day9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		
		System.out.println("enter the character to replace");
		String s0 = sc.next();
		
		System.out.println("what do you want to replace it with?");
		String s1 = sc.next();
		
		s=s.replace(s0, s1);
		System.out.println(s);
	}

}
