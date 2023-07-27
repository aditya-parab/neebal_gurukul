package com.day9;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_day9_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the address");
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
//		String s1 = "https://cloudflare.com/learning/";
		String [] arr = s1.split("/|:");
		if(arr.length==5) {
//			String arr1 = arr.toString();
//			String[] arr2 = arr1.split("\\:");
//			System.out.println(arr2[0]);
//			System.exit(0);
			
			System.out.println(arr[3].trim());
			System.exit(0);
		}
		System.out.println(arr[3]);
//		System.out.println(Arrays.toString(arr));
		

	}

}
