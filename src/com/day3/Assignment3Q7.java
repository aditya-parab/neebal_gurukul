package com.day3;

import java.util.Scanner;

public class Assignment3Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the number ");
		int num = sc.nextInt();
//		int num = 7564;
		int num1 = num;

		String ans="";
		String word="";
		
		num = num1; //reset num
		
	
		while(num!=0) {
			int digit = num%10;
		
			switch (digit) {
			case 0:
				ans="Zero";
			case 1:
				word="One";
				break;
			case 2:
				word="Two";
				break;
			case 3:
				word="Three";
				break;
			case 4:
				word="Four";
				break;
			case 5:
				word = "Five";
				break;
			case 6:
				word="Six";
				break;
			case 7:
				word="Seven";
				break;
			case 8:
				word= "Eight";
				break;
			case 9:
				word="Nine";
				break;
//		
			}
			ans=word+" "+ans;
			num = num/10;
		}
		System.out.println(ans);
		

	}
}


