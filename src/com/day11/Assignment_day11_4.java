package com.day11;

public class Assignment_day11_4 {

	
	
	
	
	public static String capitalize(String s,int i) {
String ch = "";

		if(i>s.length()-1 || i+1>s.length()-1) {
			return "";
		}
		if(i==0) {
			ch= ""+Character.toUpperCase(s.charAt(i))+s.charAt(i+1); //to handle initial word
		}
		if(s.charAt(i)==' ' ) {
			 ch= ""+Character.toUpperCase(s.charAt(i+1)); //to 
		}
		if(!(s.charAt(i)==' ' )&& i!=0) {
			 ch = s.charAt(i+1)+""; //for the normal lower case words
		}
		
		return ch+capitalize(s, i+1);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(capitalize(" this is a title",0));

	}

}
