package com.day7;

import java.util.Scanner;

public class test1_longestSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give me size n: (in positive numbers) ");
		 int n=sc.nextInt();
		 int [] arr = new int[n];
		 
		 for(int i=0;i<n;i++) {
			 System.out.println("please enter element at index "+i);
			 int val = sc.nextInt();
			 arr[i]=val;
		 }
		 
		 System.out.println("so your array is:");
		 
		 for(int i=0;i<n;i++) {
			 System.out.print(arr[i]+" ");
			 
		 }
		 System.out.println();

		 int maxLen = 0;
		 
		 int ansL=0;
		 int ansR=0;
		 int count=0;
		 int r;
		 int l=0;
		 
		 for(r=1; r<=n-1;r++) {
			 
			 if(arr[r]>=arr[r-1]) {
				 count+=1;
				 if(count>maxLen) {
//					 System.out.println("triggered");
					 maxLen = count;
					 ansL= l;
					 ansR=r;
				 }}
				 else {
					 l=r;
					 count=0;
					 continue;
				 }
			 }
		 System.out.println("the left index is "+ansL+" the right index is "+(ansR));
		 System.out.println("the left value is "+arr[ansL]+" the right index is "+arr[ansR]);
		 }

	}

