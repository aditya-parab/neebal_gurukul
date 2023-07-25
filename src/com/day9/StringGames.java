package com.day9;

import java.util.Scanner;

public class StringGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		
		if(first.equals(second)) {
			System.out.println( "They are equal");
		}
		else {
			String third=first+second;
			System.out.println(third);
		}
	}

}
