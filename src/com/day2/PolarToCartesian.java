package com.day2;

import java.util.Scanner;

public class PolarToCartesian {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter r");
		double r = sc.nextDouble();
		System.out.print("Enter theta");
		double theta = sc.nextDouble();
		System.out.println("The x coordinates are "+r*Math.cos(Math.toRadians(theta))+" and y coordinates are "+r*Math.sin(Math.toRadians(theta)));
		
	}

}
