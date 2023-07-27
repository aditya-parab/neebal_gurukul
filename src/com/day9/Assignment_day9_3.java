package com.day9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Assignment_day9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.next();
//		String s = "neeeballll";
		String res = "";
		int i =1;
		int flag=0;
		while(i<s.length()) {
			String add = "";
			int count=1;
			
			while(s.charAt(i)==s.charAt(i-1)) {
				count++;
				i++;
				
				if(i==s.length()) {
					flag=1;
					break;
				}
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
//		System.out.println("hi");
		res+=s.charAt(s.length()-1);
		
		if(flag==1)
	
			res=res.substring(0,res.length()-1);
		System.out.println(res);
	

	}

}
