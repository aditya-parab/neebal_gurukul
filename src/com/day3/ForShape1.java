package com.day3;

public class ForShape1 {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=i;j++) {
				int print = j%2;
				
//				if(j%2!=0)
//					print=1;
				
				System.out.print(print);
				
			}
			System.out.println();
		}

	}

}
