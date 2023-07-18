package com.day2;

import java.util.Scanner;

public class TableMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the number: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		
	}

}
