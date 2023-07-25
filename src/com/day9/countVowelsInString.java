package com.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class countVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int n = s.length();
//		ArrayList<Integer> nw = new ArrayList<Integer>() };
		ArrayList<Character> vowels  = new ArrayList<Character>() ;
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		int count=0;
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			if(vowels.contains(ch)) {
				count+=1;
			}
		}
		
		System.out.println(count);

	}

}
