package com.day9;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_day9_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[26];
		Arrays.fill(arr,0);
		
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			int in = ch-'a';
			arr[in]+=1;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("character "+(char)(i+97)+" count"+arr[i]);
			System.out.println();
		}
		}
		

	}


