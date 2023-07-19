package com.day3;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int total=0;
		
		while(num!=0) {
			int digit = num%10;
			total = total*10 + digit;
			num = num/10;
		}
		System.out.println(total);
	}

}
