package com.day9;

import java.util.Scanner;

public class Assignment_day9_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string 1");
		String s1 = sc.next();
		
		System.out.println("enter string 2");
		String s2 = sc.next();
		
//		String s1 = "abcde";
//		String s2 = "deabc";
		
		if(s1.equals(s2)) {
			System.out.println("False");
			System.exit(0);
		}
		
		char [] arr = s1.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				char t = arr[j];
				arr[j] = arr[(j+1)%arr.length];
				arr[(j+1)%arr.length] = t;
				
			}
			String check = "";
			for(int k=0;k<arr.length;k++) {
				check+=arr[k];
			}
			
//			System.out.println(check);
			
			if(check.equals(s2)) {
				System.out.println("True");
			System.exit(0);	
			}
			
			
		}
		
		System.out.println("False");
		System.exit(0);
	}
	}

