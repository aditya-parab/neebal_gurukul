package com.day8;

import java.util.ArrayList;

public class arrayListApply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Student s1 = new Student(101, "ad", 0, 10);
		Student s2 = new Student(102, "ad", 0, 10);
		Student s3 = new Student(103, "ad", 0, 10);
		Student s4 = new Student(104, "ad", 0, 10);
		Student s5 = new Student(105, "ad", 0, 10);
		Student s6 = new Student(106, "ad", 0, 10);
		Student s7 = new Student(107, "ad", 0, 10);
		
		ArrayList<Student> arr = new ArrayList<>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		arr.add(s6);
		arr.add(s7);
		
		arr.get(6).age=25;
		
		for(int i=0;i<arr.size();i++){
			for(int j=0;j<arr.size()-1;j++) {
				if(arr.get(j).getAge()>arr.get(j+1).getAge()) {
					Student t = arr.get(j);
					
					
					arr.set(j,arr.get(j+1));
					arr.set(j+1,t);
					
				}
			}
		}
		
		
		
		System.out.println(arr.size());
		
		ArrayList<Student> arr1 = new ArrayList<Student>(7);
		
		System.out.println(arr1.size());
		for(int i=1;i<arr.size();i++){

		
		
		arr1.add(arr.get(arr.size()-1-i));
		

			}
		
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
	
		System.out.println();

	}
}

