package com.day11;

public class Recursive6 {

	
	public static String binary(int x) {
		if(x==0 || x==1) { //0%2=0 and 1%2=1
			return ""+x;
		}
		
	else {
		
		return binary(x/2)+ ""+x%2;
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(binary(18));

	}

}
