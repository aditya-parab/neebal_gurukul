package com.day3;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int num = sc.nextInt();
		boolean prime=true;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
			
		}
		if(prime)
			System.out.println("Prime");
		else {
			System.out.println("Not Prime");
		}
	

	}

}
