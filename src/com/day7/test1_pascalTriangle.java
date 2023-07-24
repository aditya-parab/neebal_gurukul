package com.day7;

import java.util.Scanner;

public class test1_pascalTriangle { //INCOMPLETE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give me size n: (in positive numbers) ");
//		int n=sc.nextInt();
		int n=5;
		
		int [][] arrI = new int [n][n];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
		}
			
			int [] arrJ = new int[i];
			for(int j=1;j<=i;j++) {
				
					
					
					if(i-1>0 && i+1<n) {
					arrJ[j]=arrI[i-1][j-1]+arrI[i-1][j+2];
					System.out.print(arrJ[j]+" ");}
					else {
						
						arrJ[j]=j;
						System.out.print(arrJ[j]+" ");}
					
					arrI[i] = arrJ;
					
					}
			
		}
			
			
			System.out.println();
		}

	}


