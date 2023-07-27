package com.day9;

import java.util.Scanner;

public class Assignment_day9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string:");
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++){
			if(Character.isUpperCase(s1.charAt(i))) {
				count+=1;
			}
		}
		
		System.out.println(count+1);
	}

}
