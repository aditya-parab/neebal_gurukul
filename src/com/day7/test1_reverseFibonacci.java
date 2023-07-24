package com.day7;

import java.util.Scanner;

public class test1_reverseFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give me size n: (in positive numbers) ");
		 int n=sc.nextInt();
		 
		 int [] arr = new int [n];
		 
		int f=0;
		int s =1;
		int i=0;
		
		System.out.println("Normal sequence is:");
		while(i<n) { //fibonacci and store in array in reverse order
		
				System.out.print(f+" ");
				arr[n-1-i]=f;
				i++;
			
			int total = f+s;
			f=s;
			s=total;
			
		}	
		
		System.out.println();
		System.out.println("Reversed is:");
		
		for(int ii=0;ii<n;ii++) {
			System.out.print(arr[ii]+" ");
		}
				
				
			}
		 
		 

	}


