package com.day3;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 175;
		int y =125;
		
		while(x!=y) {
			if(x>y) {
				x=x-y;
			}
			else {
				y=y-x;
			}
		}
		System.out.println(x);

	}

}
