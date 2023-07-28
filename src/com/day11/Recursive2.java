package com.day11;

public class Recursive2 {
	
	public static int pow(int base,int power) {
		if(power==0) {
			return 1;
		}
		else {
			return base*pow(base,power-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(pow(2,2));

	}

}
