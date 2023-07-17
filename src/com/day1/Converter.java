package com.day1;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the input kilometres: ");
		double km,m,cm,inches,feet;
		 km = sc.nextDouble();
		 m = (km*1000);
		 cm = (m*100);
		 inches = (cm*2.54);
		 feet = inches/12;
		System.gc(); //garbage collector :)
		System.out.println("The output in metres is "+m+" and in centimetres is "+cm+" and in feet is "+feet+" and in inches is "+inches);
	}

}
