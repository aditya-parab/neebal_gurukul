package com.day9;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_day9_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[123];
		Arrays.fill(arr,0);
		
		Scanner sc = new Scanner(System.in);
System.out.println("Enter string:");
		String s1 = sc.next();
		System.out.println(s1);
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			for(char j=65;j<122;j++) {
			
			if(ch==j)
			arr[j]++;
		}
		}
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				continue;
			System.out.print("character "+(char)(i)+" count"+arr[i]);
			System.out.println();
		}
		}
		

	}


