package com.day5;


class Bank1{
	String name;
	static int count=1000;
	 int id;
	String branch;
	static double bankBalance=0.0;
	double balance;
	
	Bank1(){
		
	}
	
	Bank1(String name,String location,int balance){
		count++;
		this.name=name;
		this.id=count;
		this.branch=location;
		this.balance=balance;
		Bank1.bankBalance+=balance;
	}
	
	
	void deposit(double amt) {
		this.balance=this.balance+amt;
		Bank1.bankBalance+=amt;
	}
	
	double currentBalance() {
		return this.balance;
	}
	
	String getName() {
		return this.name;
	}
	
	void withdraw(double amt) {
		this.balance=this.balance-amt;
		Bank1.bankBalance-=amt;
	}
	
	static double getTotal() {
		return Bank1.bankBalance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+ this.name+" Account Number "+id+" Balance"+this.balance+" Branch"+ this.branch;
	}
	
}


public class BankDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				Bank1  acc1=new Bank1("Ram","Bandra", 2500);
				Bank1  acc2=new Bank1("Sita", "Bandra", 3500);
				Bank1  acc3=new Bank1("Rahim", "Bandra", 2800);
				Bank1  acc4=new Bank1("Rita", "Bandra", 5500);
				acc1.deposit(5000);
				acc2.deposit(2500);
				acc3.withdraw(1200);
				System.out.println(acc1);
				//Name: Ram Account Number 1001   Balance Rs.7500 Branch: Bandra 
				System.out.println(acc2);
				//Name: Sita Account Number 1002   Balance Rs.6000 Branch: Bandra 

				System.out.println(acc3);
				//Name: Rahim Account Number 1003   Balance Rs.1600 Branch: Bandra 
				System.out.println(acc4);
				//Name: Rita Account Number 1004   Balance Rs.5500 Branch: Bandra 
				
				System.out.println(Bank1.getTotal()); //20600
	}

}
