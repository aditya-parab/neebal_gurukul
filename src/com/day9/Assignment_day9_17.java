//
package com.day9;

import java.util.Scanner;

public class Assignment_day9_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first string");
		String s1 = sc.next();
		System.out.println("Please enter second string");
		String s2 = sc.next();
//		String s1 = "abcde";
//		String s2 = "abcd";
		String ans="";
		int i=0;
		int j=0;
		int count=0;
		while(i!=s1.length()-1 && j!=s2.length()-1) {
			if(s1.charAt(i)==s2.charAt(j)) {
				count++;
				ans+=s1.charAt(i);
				
			}
			i++;
			j++;
		}
		
		if(i!=s1.length()-1) {
			while(i!=s1.length()-1) {
				if(s1.charAt(i)==s2.charAt(j)) {
					count++;
					ans+=s1.charAt(i);
				}
				i++;
			}
			
		}
		
		if(j!=s2.length()-1) {
			while(j!=s2.length()-1) {
				if(s1.charAt(i)==s2.charAt(j)) {
					count++;
					ans+=s1.charAt(i);
				}
				j++;
			}
			
		}
		System.out.println(ans);
		

	}

}
