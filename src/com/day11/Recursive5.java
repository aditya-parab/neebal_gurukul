package com.day11;

public class Recursive5 {

	
	public static String reverse(int n) {
		
		if(n/10==0) {
			return n+"";
		}
	
		else {
			return n%10+reverse(n/10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverse(1234));
	}

}
