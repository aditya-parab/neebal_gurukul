package com.day9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Assignment_day9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		String s = "neeebal";
		String res = "";
		int i =1;
		while(i<s.length()) {
			String add = "";
			int count=1;
			
			while(s.charAt(i)==s.charAt(i-1)) {
				count++;
				i++;
			}
			
			if(count!=1) {
				add = s.charAt(i-1)+""+count;
				
			}
			else {
				add=s.charAt(i-1)+"";
			}
			res+=add;
			i++;
			
		}
		System.out.println("hi");
		res+=s.charAt(s.length()-1);
		System.out.println(res);
	

	}

}
