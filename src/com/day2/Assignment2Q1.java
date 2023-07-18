                                                                                                                            package com.day2;

import java.util.Scanner;

public class Assignment2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter r1");
		int r1 = sc.nextInt();
		System.out.println("Please enter th1");
		int th1 = sc.nextInt();
		System.out.println("Please enter r2");
		int r2 = sc.nextInt();
		System.out.println("Please enter th2");
		int th2 = sc.nextInt();
//		
		
//		double r1 = 5;
//		double th1 = 50;
//		double r2 = 6;
//		double th2=50;
		double r3,th3;
	
		//convert to cartesian
		double x1 = r1*Math.cos(Math.toRadians(th1));
		double y1 = r1*Math.sin(Math.toRadians(th1));
		
		double x2 = r2*Math.cos(Math.toRadians(th2));
		double y2 = r2*Math.sin(Math.toRadians(th2));
		
		double x3= x1+x2;
		double y3 = y1+y2;
		
		//convert to polar
		r3 = Math.sqrt((Math.pow(x3,2)+ Math.pow(y3,2)));
		
		th3 = Math.atan(y3/x3);
		
		System.out.println(r3);
		System.out.println(Math.toDegrees(th3));
			

	}

}
