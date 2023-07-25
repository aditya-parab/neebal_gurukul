package com.day9;

import java.text.NumberFormat;
import java.util.Scanner;

public class CheckStringConvertableInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		double res1=0;
		String ans="";
		
		try {
		 res1 = Integer.parseInt(s);
		 ans="It is Integer";
		 
		}
		catch (NumberFormatException e) {
			try{res1 = Double.parseDouble(s);
			ans="It is Double";
			}
			catch (NumberFormatException e1) {
				// TODO: handle exception
				System.out.println("Cannot be converted");
				System.exit(0);
			}
			
			
		}
	
		System.out.println(ans);
	
	}

}
