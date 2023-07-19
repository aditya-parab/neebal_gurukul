package com.day3;

public class UsingBitwiseForMultiplyDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=19;
		int y = 10;
		 int sum=0;
		while(x!=0) {
			if(x%2!=0) {
				sum+=y;
			}
			x=x>>1;//divide
			y=y<<1;//multiply
		}
		System.out.println(sum);

	}

}
