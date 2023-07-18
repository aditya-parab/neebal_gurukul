package com.day2;

import java.util.Scanner;

public class GetTheBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bit = sc.nextInt();
		int want = num&(1<<(bit-1));
//		int ans = num&want;
		System.out.println(want);

	}

}
