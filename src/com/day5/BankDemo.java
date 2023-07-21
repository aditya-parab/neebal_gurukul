package com.day5;

import java.util.Scanner;

class Bank{
	String name;
	int id;
	String branch;
	double balance;
	
	Bank(){}
	
	Bank(String name,int id,String location,int balance){
		this.name=name;
		this.id=id;
		this.branch=location;
		this.balance=balance;
	}
	
	void deposit(double amt) {
		this.balance=this.balance+amt;
	}
	
	double currentBalance() {
		return this.balance;
	}
	
	String getName() {
		return this.name;
	}
	
	void withdraw(double amt) {
		this.balance=this.balance-amt;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+ this.name+" Account Number "+this.id+" Balance"+this.balance+" Branch"+ this.branch;
	}
}

public class BankDemo {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			Bank  acc1=new Bank("Ram", 123456, "Bandra", 2500);
			
			acc1.deposit(2550);
			
			double bal=acc1.currentBalance();
			
			System.out.println(acc1.getName()+" has "+ bal+"amount");
					// Ram has 5050 amount
			
			System.out.println("Enter the amount to withdraw");
			double am=sc.nextDouble();//4500
			
			if(acc1.currentBalance()>am)
			
			acc1.withdraw(am);
			else
				
			System.out.println("Insufficient fund"); //output .because Minimum balance 1000
			
			
			System.out.println("Details of the account holder"+ acc1);
			
			// Name: Ram Account Number 123456   Balance Rs.5050 Branch: Bandra 

			
	       Bank  acc2=new Bank("Sita", 23456, "Bandra", 2000);
			
			acc2.deposit(2550);
			
			 bal=acc2.currentBalance();
			
			System.out.println(acc2.getName()+" has "+ bal+"amount");
					// Sita has 4050 amount
			
			System.out.println("Enter the amount to withdraw");
			 am=sc.nextDouble();//2500
			
			if(acc2.currentBalance()>am)
			
			acc2.withdraw(am);
			else
				
			System.out.println("Insufficient fund"); 
			
			System.out.println("Details of the account holder"+ acc2);
			
			// Name: Sita Account Number 23456   Balance Rs.1550 Branch: Bandra 

		}
	

	}
