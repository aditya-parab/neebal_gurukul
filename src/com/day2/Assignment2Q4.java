package com.day2;

import java.util.Scanner;

public class Assignment2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int quadrant=1;
		if(x>0 && y<0)
			quadrant=4;
		if(x<0 && y<0)
			quadrant=3;
		if(x<0 && y>0)
			quadrant=2;
		
		if(x==0 && y==0) {
			System.out.println("Point is at origin");
			return;
		}
		
		if(x==0) {
			System.out.println("The quadrant is y axis");
			return;
		}
		if(y==0) {
			System.out.println("The quadrant is x axis");
			return;
		}
		
		
		
		System.out.println("The quadrant is "+quadrant);
		

	}

}
