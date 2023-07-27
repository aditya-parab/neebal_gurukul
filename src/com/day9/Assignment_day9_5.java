package com.day9;

import java.util.Scanner;

public class Assignment_day9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		s=s.trim();
//		String s="The fox jumped over the wall";
		String[] arr = s.split(" ");
		System.out.println(arr.length);

	}

}
