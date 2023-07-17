package com.day1;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String args []) {
		
		double s,area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("The side of the equilateral triangle is: ");
		s = sc.nextDouble();
		area = (Math.sqrt(3)/4)*Math.pow(s,2);
		
		System.out.println("The area of equilateral triangle is: "+ area);
		}

}
