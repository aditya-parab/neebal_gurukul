package com.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Student implements Comparable<Student>{
	private String name;
	private int rollno;
	 private int math;
	 private int phy;
	 private int chem;
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	 
	 Student(String n,int r,int m,int p,int c){
		 name = n;
		 rollno=r;
		 math = m;
		 phy=p;
		 chem = c;
	 }

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno - o.rollno;
	}
	
	public boolean isFail(int sub) {
		return sub<50;
	}
	
	public int numberOfFailed() {
		int count=0;
		if(this.math<50)
			count++;
		if(this.phy<50)
			count++;
		if(this.chem<50)
			count++;
		
		return count;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.getName();
	}
}

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("A", 00, 75, 90, 70);
		Student s2 = new Student("B", 01, 35, 30, 10); //math,phy,chem
		Student s3 = new Student("C", 02, 25, 40, 70); //math,phy
		Student s4 = new Student("D", 03, 15, 10, 20); //math,phy,chem
		Student s5 = new Student("E", 04, 75, 30, 20); //phy,chem
		Student [] studentArray = {s1,s2,s3,s4,s5};
		
		ArrayList<Student> studentMathFailed = new ArrayList<Student>();
		ArrayList<Student> studentPhyFailed = new ArrayList<Student>();
		ArrayList<Student> studentChemFailed = new ArrayList<Student>();
		
		ArrayList<Student> failAtLeast2 = new ArrayList<Student>();
		
		for(Student s:studentArray) {
			if(s.isFail(s.getMath()))
				studentMathFailed.add(s);
		}
		
//		ArrayList<Student> studentPhyFailed = new ArrayList<Student>();
		for(Student s:studentArray) {
			if(s.isFail(s.getPhy()))
				studentPhyFailed.add(s);
		}
		
//		ArrayList<Student> studentChemFailed = new ArrayList<Student>();
		for(Student s:studentArray) {
			if(s.isFail(s.getChem()))
				studentChemFailed.add(s);
		}
		
		for(Student s:studentArray) {
			if(s.numberOfFailed()==2) {
				failAtLeast2.add(s);
				
			}
		}
		
		HashSet<Student> set4 = new HashSet<Student>();
		set4.addAll(failAtLeast2);

//		
//		 for(Student s:studentMathFailed) {
//	            System.out.println(s.getName());
//	        }
//		 System.out.println();
//		 for(Student s:studentPhyFailed) {
//	            System.out.println(s.getName());
//	        }
//		 System.out.println();
//		   for(Student s:studentChemFailed) {
//	            System.out.println(s.getName());
//	        }
		
		HashSet<Student> set1 = new HashSet<Student>();
		
		HashSet<Student> set2 = new HashSet<Student>();
		HashSet<Student> set3 = new HashSet<Student>();
		set1.addAll(studentMathFailed);
		set2.addAll(studentPhyFailed);
		set3.addAll(studentChemFailed);
		
		  set1.retainAll(set2);
		  set1.retainAll(set3);
	
		
	
		System.out.println(set1);
		System.out.println(set4);
			
			
		
		

	}

}
