package com.day11;

public class Assignment_day11_5 {

	
	public static int count(String s,int i) {
		if(i==0){
			return 1;
		}
		
		if(Character.isUpperCase(s.charAt(i)))
		return 1+count(s,i-1);
		else {
			return count(s,i-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		String str = "camelCase is Cool";
System.out.println(count(str,str.length()-1));

	}

}
