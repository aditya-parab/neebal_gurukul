package com.day3;

public class Assignment3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=1;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("_");
			}
			for(int k =1;k<=i;k++) {
				System.out.print((ch));
				ch=(ch+1);
				if(ch>9)
					ch=0;
			}
			
		System.out.println();
		}

	}

}
