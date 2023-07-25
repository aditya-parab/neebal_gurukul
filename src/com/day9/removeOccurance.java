package com.day9;

import java.util.Scanner;

public class removeOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String word = sc.next();
//		s=s.replace(word, "");
//		s=s.trim();
		int len = word.length();
		int i=0;
		while(i!=-1) {
			i=s.indexOf(word);
			
			
			if(i!=-1) {
				s=s.substring(0,i).trim()+" "+s.substring(i+len).trim();
				s=s.trim();
				i++;
				
			}
		}
		
		System.out.println(s);
		

	}

}
