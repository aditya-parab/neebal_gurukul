package com.day1;

import java.util.Scanner;

public class Assignment1Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
//		int units = sc.nextInt();
		double extra,price;
		price = 0;
		int units = 310;
		if(units>100) {
			price = 100*4;
			units = units-100;
			
			if(units>100) {
				price = price+200*5;
				units = units-100;
			}
			if(units>100) {
				price=price+ (units%100)*10;
			}
			
		}
		
		if(price>1000) {
			price = price+(price*(0.05));
		}
		double total = price+(price*0.18);
		System.out.println("Name is "+ name);
		System.out.println("price is "+ price);
		System.out.println("Amount "+total);

	}

}
