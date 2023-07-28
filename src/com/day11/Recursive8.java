package com.day11;

public class Recursive8 {
	
	public static int vowelscalc(String s) {
		char ch = s.charAt(s.length()-1);
		int flag=0;
		if(s.length()-1<=0)
			return 0;
		if(ch == 'a' || ch=='i' || ch =='o' || ch=='e' || ch=='u') {
			flag=1 ;
		}
		else {
			flag=0;
			
		}
		return flag+vowelscalc(s.substring(0,s.length()-1));
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//take a string and calculate number of vowels
		
		System.out.println(vowelscalc("abcdei"));
	}

}
