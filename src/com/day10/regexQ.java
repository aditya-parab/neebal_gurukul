package com.day10;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s  = "adi is a god boy";
String regex = "[a-zA-Z0-9]";

Pattern pattern = Pattern.compile(regex);

String [] arr = s.split(" ");

int count=0;
int flag=0;
for(String val:arr) {
	Matcher match = pattern.matcher(val);
	if(match.matches()) {
		
		if(Character.isDigit(val.charAt(0))) {
			flag=1;
		}
		count++;
	}
//	else {
//		flag=1;
//	}
	
}

if(flag==0)
	System.out.println("MATCHES");
else {
	System.out.println("DOES NOT MATCH");
}

	}}
