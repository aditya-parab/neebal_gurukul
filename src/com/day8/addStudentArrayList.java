package com.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class addStudentArrayList {
	
	static boolean checkAge(Student s) {
		return s.getAge()>15;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arr = new ArrayList<Student>();
		
		Student s1 = new Student(101, "ad", 22, 10);
		Student s2 = new Student(102, "ad", 10, 10);
		Student s3 = new Student(103, "ad", 30, 10);
		Student s4 = new Student(104, "ad", 41, 10);
		Student s5 = new Student(105, "ad", 29, 10);
		Student s6 = new Student(106, "ad", 20, 10);
		Student s7 = new Student(107, "ad", 25, 10);
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		arr.add(s6);
		arr.add(s7);
		
		for(int i=0;i<6;i++) {
			if(checkAge(arr.get(i))) {
				System.out.println(arr.get(i));
			}
		}
		
		
		
	}

}
