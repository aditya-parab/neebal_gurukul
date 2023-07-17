package com.day1;

import java.util.Scanner;

public class MinimumNotes {
public static void main(String [] args) {
	System.out.print("Enter the amount: ");
	Scanner sc = new Scanner(System.in);
	int amt, rem2000,rem500,rem200,rem100,rem50,rem20,rem10,rem5;
	amt = sc.nextInt();
	
	
	///////////////
	rem2000 = amt / 2000;
		
	amt = amt%2000;
	
	//////////////
	rem500 = amt / 500;
	
	amt = amt%500;
	///////////////
	rem200 = amt / 200;
	
	amt = amt%200;
	///////////////
	
	rem100 = amt / 100;
	
	amt = amt%100;
	///////////////
	
	rem50 = amt / 50;
	
	amt = amt%50;
	///////////////
	
	rem20 = amt / 20;
		
	amt = amt%20;
	///////////////
	
	rem10 = amt / 10;

	amt = amt%10;
	///////////////
	
	
	rem5 = amt / 5;

	amt = amt%5;
	///////////////
	
	System.out.println(rem2000+" x 2000 = "+rem2000*2000);
	System.out.println(rem500+" x 500 = "+rem500*500);
	System.out.println(rem200+" x 200 = "+rem200*200);
	System.out.println(rem100+" x 100 = "+rem100*100);
	System.out.println(rem50+" x 50 = "+rem50*50);
	System.out.println(rem20+" x 20 = "+rem20*20);
	System.out.println(rem10+" x 10 = "+rem10*10);
	System.out.println(rem5+" x 5 = "+rem5*5);	
	
	
}
}
