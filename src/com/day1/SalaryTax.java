package com.day1;

import java.util.Scanner;

public class SalaryTax {

	public static void main(String[] args) {
		double salary;
		double tax;
		System.out.print("What is the salary: ");
		Scanner sc = new Scanner(System.in);
		salary = sc.nextDouble();
		
		if(salary>1500000) {
			tax = 0.3;
		}
		else {
			if(salary>1000000 && salary<=1500000) {
				tax = 0.2;
			}
			else if (salary>750000 && salary <=1000000){
				tax = .10; 
			}
			else {
				tax = 0;
			}
		}
		double takehomesalary = salary-(tax*salary);
		System.out.println("The salary is "+salary);
		System.out.println("The tax is "+tax);
		System.out.println("The takehome salary is " + takehomesalary);

	}

}
