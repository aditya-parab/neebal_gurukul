package com.day9;

import java.util.Scanner;

public class Assignment_day9_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String s = sc.nextLine();
//		String s = "The quick brown fox jumps over something like a black log or idk honestly";
		String [] s1 = s.split(" ");
		
	
		System.out.println("please enter the line limit");
		int n = sc.nextInt();
		String ans = "";
		int sLength=0;
		for(int i=0;i<s1.length;i++) {
			sLength+=s1[i].length();
			if(sLength<=n)
				ans+=s1[i]+" ";
			else {
				ans+="\n"+s1[i]+" ";
				sLength=0;
			}
		}
		
		System.out.println(ans);

	}

}
