package com.day11;

public class Assignment_day11_2 {

	
	public static int countDigits(int x) {
//		System.out.println(x);
		if(x%10<=0){
			return 0;
		}
		
		return 1+countDigits(x/10);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countDigits(1985));

	}

}
