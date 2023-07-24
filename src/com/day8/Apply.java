package com.day8;
		// Other method is to override Hashcode function in Object class (or any other non-final function in Object class that returns int) and make it return id.
		// so, two ways: make interface and define a function to be overridden in derived classes
		// or instead of using interface, override a object class function -- but make sure that func is final and returned the datatype u wanted to begin. Instead of searching all this, I suppose its better to make an interface.

import java.util.ArrayList;
import java.util.List;

interface Show{
	int getId();
}
class Student implements Show{
	int id;
	String name;
	protected int age;
	double fees;
	
	public int getAge() {
		return age;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, int age,double fees) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.age=age;
		this.fees = fees;
	}
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+id+" name:"+name+" age:"+age+" fees:"+fees;
	}
	
	
}

class Distance implements Show{
int id;
	int m;
	int cm;
	
	public Distance() {
		// TODO Auto-generated constructor stub
	}
	
	public Distance(int id,int m, int cm) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.m=m;
		this.cm = cm;
		
		
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id "+id+" m:"+m+" cm"+cm;
	}
}



public class Apply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1 = new ArrayList<>();
		
		
		List z = new ArrayList<>();
		
		Show d1 = new Distance (203,20,2);
		Show d2 = new Distance (101,25,5);
		Show d3 = new Distance (202,27,1);
		
//		d1.set(100);
//		d2.set(101);
//		d3.set(103);
//		
		Show s1 = new Student(100,"AAA",12,20000);
		Show s2 = new Student (102,"BBB",22,30000);
		
		
		
		Show a[] = new Show[5];
		
		a[0]=d1;
		a[1]=d2;
		a[2]=d3;
		a[3]=s1;
		a[4]=s2;
		
		for(int i=1;i<=4;i++) {
			for(int j=0;j<a.length-1;j++) {
				
				
				
					if(a[j].getId()>a[j+1].getId()){
						Show t = a[j];
						a[j]=a[j+1];
						a[j+1] = t;
						
							}
				}
		}
				
			
					
					
					
					
				
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			}
		}
		
		
		
		
	

	}
