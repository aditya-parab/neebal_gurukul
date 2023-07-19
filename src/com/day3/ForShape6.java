package com.day3;

public class ForShape6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1 ; i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			for(int j = 1; j<=5-i;j++) {
				System.out.print("_");
			}
			for(int j = 1; j<=5-i;j++) {
				System.out.print("_");
			}
			for(int j=i;j>=1;j--) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}

	}

}
