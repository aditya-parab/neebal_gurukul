package com.day1;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String [] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("What is the radius: ");
		double r = sc.nextDouble();
		
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("Area of circle is "+area);
	}

}
