package com.day9;

import java.util.Scanner;

public class Assignment_day9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'c'-'a'+95);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		
		System.out.println("1 for encrypt and 2 for decrypt. Make ur choice");
		int n = sc.nextInt();
//		String s = "mother";
		String ans="";
//int n=1;
		if(n==1) {
			ans="";
			for(int i =0; i<s.length();i++) {
				char ch = s.charAt(i);
				int ch_new = ((ch-'a')+5)%26+95;
				ans+=(char)ch_new;
			
			}

		}
//		
		if(n==2) {
			ans="";
			for(int i =0; i<s.length();i++) {
				char ch = s.charAt(i);
				int ch_new = ((ch-'a')-1)%26+95;
				ans+=(char)ch_new;
			
			}
		}
		
		
		System.out.println(ans);

	}

}
