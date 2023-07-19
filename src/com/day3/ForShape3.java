package com.day3;

public class ForShape3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("_");
			}
			for(int k =1;k<=i;k++) {
				System.out.print(k);
			}
		System.out.println();
		}
		
		

	}

}
