package com.day16;

import java.util.Hashtable;
import java.util.Scanner;

public class convertNumbersToString {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "Zero");
		ht.put(1, "One");
		ht.put(2, "Two");
		ht.put(3, "Three");
		ht.put(4, "Four");
		ht.put(5, "Five");
		ht.put(6, "Sixx");
		ht.put(7, "Seven");
		ht.put(8, "eight");
		ht.put(9, "nine");
		int num=435;
		String ans = "";
		while(num!=0) {
			int n = num%10;
//			System.out.println(n);
			
			ans=" "+ ht.get(n)+ans;
			
			num=num/10;
		}
		
		System.out.println(ans.trim());

	}

}
