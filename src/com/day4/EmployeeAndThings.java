package com.day4;

class Employee{
	private String name;
	private String employeeId;
	private double salary;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(String name,String employeeId,double salary,String dept){
		this.name = name;
		this.employeeId=employeeId;
		this.salary=salary;
		this.dept=dept;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return " Name :"+name +" Employee ID: "+employeeId+" Salary: "+salary+" Department: "+dept;
	}
	
}

public class EmployeeAndThings {
	


	public static void main(String[] args) {
		
		
		
		Employee a = new Employee("a","1111",250,"Software");
		Employee b = new Employee("b","2222",450,"HR");
		Employee c = new Employee("c","3333",150,"Sales");
		
		//find employee with highest salary
		Employee highestSalary = a;
		
		
		
		if(b.getSalary()>highestSalary.getSalary() )  {
			highestSalary = b;
			
		}
		
		if(c.getSalary()>highestSalary.getSalary()) {
			highestSalary=c;
		}
		
		System.out.println("Employee with highest salary is "+highestSalary.toString());
		
		//Update all salaries by 20%
		a.setSalary(a.getSalary()*1.20);
		b.setSalary(b.getSalary()*1.20);
		c.setSalary(c.getSalary()*1.20);
		
		System.out.println("Department of employee with highest salary is "+ highestSalary.getDept());
		
		
	}

}
 