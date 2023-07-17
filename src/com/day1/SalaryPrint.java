package com.day1;

import java.util.Scanner;

public class SalaryPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the salary: ");
		
		double salary =sc.nextDouble();
		
		if(salary < 30000) {
			salary = salary+(0.05*salary);
		}
		
		System.out.println("The processed salary is "+salary);
		

	}

}
