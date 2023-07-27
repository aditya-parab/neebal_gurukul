package com.day9;

import java.util.Scanner;

public class Assignment_day9_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		s=s.toUpperCase();
		String arr [] = s.split("[\\W]");
		String s1="";
		for(int i=0;i<arr.length;i++) {
			s1+=arr[i];
		}
//		System.out.println(s1);
		
		
//String s  ="aabb2a";
int l=0;
int h=s1.length()-1;
int flag=0;

while(l<h) {
	if(s1.charAt(l)!=s1.charAt(h)) {
		flag=1;
		break;
	}
	l++;
	h--;
}
if(flag==1) {
	System.out.println("Not palindrome");
}
else {
	System.out.println("palindrome");
}


	}

}
