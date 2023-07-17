package com.day1;

import java.util.Scanner;

public class Assignment1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,first,second;
		num = sc.nextInt();
		first = num/100;
		second = num%100;
		System.out.println(second*100+first);

	}

}
