package com.day9;

import java.util.Scanner;

public class Assignment_day9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
//		String s1 = "222.222.222.222";
		String arr [] = s1.split("\\.");
		System.out.println(arr.length);
		if(arr.length!=4) {
			System.out.println("Not valid IP because length");
			System.exit(0);
		}
		
		for(int i=0;i<arr.length;i++) {
			int val=Integer.parseInt(arr[i]);
			if(!(val>=0 && val<=255)) {
				System.out.println("Not valid IP");
				System.exit(0);
			}
		}
		
		System.out.println("VALID IP");
		
		

	}

}
