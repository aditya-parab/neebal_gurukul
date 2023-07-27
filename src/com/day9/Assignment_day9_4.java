package com.day9;

import java.util.Scanner;

public class Assignment_day9_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.next();
//		String s= "(()))())";
		int count= 0;
		
		if(s.charAt(0)==')') {
			System.out.println("The string is not balanced paranthesis");
			System.exit(0);
		}
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='(') {
				count++;
			}
			if(ch==')') {
				count--;
			}
			if(count<0)
				break;
		}
		
		if(count==0) {
			System.out.println("The string has balanced paranthesis");
		}
		else {
			System.out.println("The string does not have balanced paranthesis");
		}
		
	}
	}

