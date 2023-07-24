package com.day7;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give me size n: (in positive numbers) ");
		 n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
		}
			
			for(int j=1;j<=i;j++) {
				
					System.out.print("* ");

		}
			System.out.println();
		}
		} while(n>0);
		
		System.out.println("The program is over because you cannot follow rules.");

	}

}
