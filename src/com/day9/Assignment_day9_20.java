package com.day9;

import java.util.Scanner;

public class Assignment_day9_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string:");
		String s1 = sc.nextLine();
		s1=s1.trim();
//String s1 = "hello my name is aditya";
String[] arr = s1.split(" ");
String ans="";
for(String a:arr) {
	ans+=a.substring(0,1).toUpperCase()+a.substring(1)+" ";
}

System.out.println(ans);
	}

}
