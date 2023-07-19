package com.day3;

public class GCD_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 175;
		int y =125;
		int r=99;
		while(r!=0) {
			r = x%y;
			x=y;
			if(r ==0)
				break;
			y=r;
			
		
		}
		System.out.println(y);
	}

}
