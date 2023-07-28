package com.day11;

public class Recursive3 {
	
	public static int gcd(int a,int b) {
		if(a%b <= 0) {
			return b;
		}
		else {
			return gcd(b,a%b);
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Pseudo Code of the Algorithm-
		Step 1:  Let  a, b  be the two numbers
		Step 2:  a mod b = R
		Step 3:  Let  a = b  and  b = R
		Step 4:  Repeat Steps 2 and 3 until  a mod b  is greater than 0
		Step 5:  GCD = b
		Step 6: Finish*/
		System.out.println(gcd(20,30));
		

	}

}
