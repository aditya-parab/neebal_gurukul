package com.day2;

import java.util.Scanner;

public class PrintUnicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the lower bound: ");
		
		Scanner sc = new Scanner(System.in);
		
		int low = sc.nextInt();
		
		System.out.print("Please enter the upper bound: ");
		int high = sc.nextInt();
		
		for(int i=low;i<=high;i++) {
			System.out.println((char)i + " - " + i);
		}
	}

}
