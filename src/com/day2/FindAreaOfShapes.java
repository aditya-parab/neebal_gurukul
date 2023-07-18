package com.day2;

import java.util.Scanner;

public class FindAreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please select your shape by choosing integer : 1.Square 2.Circle 3.Triangle");
		Scanner sc = new Scanner(System.in);
	
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			
			System.out.println("Please enter side: ");
			double side = sc.nextDouble();
			double area = side*side;
			System.out.println("Area of Square = "+area);
			break;
		}
		
		case 2:{
			System.out.println("Please enter radius: ");
			double r = sc.nextDouble();
			double area = Math.PI*r*r;
			System.out.println("Area of Circle = "+area);
			break;

			
		}
		
		case 3:{
			System.out.println("Please enter length and breadth of Triangle: ");
			double l = sc.nextDouble();
			double b = sc.nextDouble();
			double area = 0.5*l*b;
			System.out.println("Area of Triangle = "+area);
			break;

			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

}
