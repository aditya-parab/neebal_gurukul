package com.day11;

public class Recursive1 {

	
	public static int sumOfN(int n) {
		if(n==0)
			return 0;
		else {
			return n+sumOfN(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfN(7));
		

	}

}
