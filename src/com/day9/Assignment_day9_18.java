package com.day9;

import java.util.Scanner;

public class Assignment_day9_18 {

	public static void main(String[] args) {
		
		
		  char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f',
                  'g', 'h', 'i', 'j', 'k', 'l',
                  'm', 'n', 'o', 'p', 'q', 'r',
                  's', 't', 'u', 'v', 'w', 'x',
                  'y', 'z', '1', '2', '3', '4',
                  '5', '6', '7', '8', '9', '0' };
		  
		  String[] morsebank
          = { ".-",   "-...", "-.-.", "-..",  ".",
              "..-.", "--.",  "....", "..",   ".---",
              "-.-",  ".-..", "--",   "-.",   "---",
              ".--.", "--.-", ".-.",  "...",  "-",
              "..-",  "...-", ".--",  "-..-", "-.--",
              "--..", "|" };
		
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string");
		String s = sc.nextLine();
		
		System.out.println("Choose \n 1. English to morse");
		System.out.println("2. Morse to English");
		int n= sc.nextInt();
		  String ans="";

		  
//		  String s = "alice";
//		  String s = "... -.-. .... --- --- .-..";
		String [] s1 = s.split(" ");
		if(n==1) {
			
		//english to morse code :D

		

		  for(int i=0;i<s.length();i++) {
			  for(int j=0;j<alphabets.length;j++) {
				  if(s.charAt(i)==alphabets[j])
					  ans+=morsebank[j];
				  
			  }
		  }
		}
		else {
		  //morse to english
		
		  
		  for(int i=0;i<s1.length;i++) {
			  for(int j=0;j<morsebank.length;j++) {
				  if(s1[i].compareTo(morsebank[j])==0){
					  ans+=alphabets[j];
					  
				  }
			  }
			  
		  }
		  
		}
		System.out.println(ans);
		  
	}

}
