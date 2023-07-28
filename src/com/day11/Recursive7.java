package com.day11;

public class Recursive7 {

	
	public static int prod(int x,int y) {
		
		if(x==0) {
			return 0;
		}
		
		else {
			if(x%2!=0) {
				return y+prod(x/2,y*2);
			}
			else {
				return prod(x/2,y*2);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prod(19,10));
		

	}

}
