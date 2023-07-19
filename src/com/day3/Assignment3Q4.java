package com.day3;

public class Assignment3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans ="";
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {

				ans=(j%2)+ans;
			}
			System.out.print(ans);
			ans="";
			
			System.out.println();
		}

	}

}
