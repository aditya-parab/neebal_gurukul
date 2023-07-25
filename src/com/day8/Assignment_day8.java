package com.day8;

import java.util.*;


class CourseData{
	String name;
	int id;
	String semester;
	
	public CourseData() {
		// TODO Auto-generated constructor stub
	}
	
	CourseData(String name, int id, String semester){
		this.name=name;
		this.id=id;
		this.semester=semester;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Course name: "+name+" Course Id: "+id+" semester: "+semester;
	}
	
	
}


class StudentData{
	String name;
	int id;
	ArrayList<CourseData> courseList = new ArrayList<CourseData>();
	
	public StudentData() {
		// TODO Auto-generated constructor stub
	}
	
	public void addCourse(CourseData c) {
		courseList.add(c);
	}
	
	StudentData(String name, int id){
		this.name=name;
		this.id= id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: "+name+" id: "+id+" courseList: "+courseList;
	}


	
}

public class Assignment_day8 {
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentData> roster = new ArrayList<StudentData>();
		ArrayList<String> roster_names = new ArrayList<String>();
		
		while(true) {
		System.out.println("Please enter your action: \n");
		System.out.println("1. Add new student to roster");
		System.out.println("2. Enrol a student in a course");
		System.out.println("3. Display all the students in the roster");
		System.out.println("4. Remove the student from the list using ID");
		System.out.println("5. Exit");
		System.out.println();
		
		int n = sc.nextInt();
		
		switch (n) {
		case 1: {
			//add new student to roster
			System.out.println("Please enter the students name");
			String new_name = sc.next();
			roster_names.add(new_name);
			System.out.println("Please enter id");
			int id = sc.nextInt();
				
			StudentData s = new StudentData(new_name,id);
			roster.add(s);
			break;
			}
					
			
		
		
		case 2:{
			//enrol a student in a course

			
			System.out.println("Please enter the students name");
			String new_name = sc.next();
			
			if(roster_names.contains(new_name)) {
				System.out.println("Here are the available courses: ");
				System.out.println("physics");
				System.out.println("math");
				System.out.println("eng");
				System.out.println("geo");
				System.out.println("Please enter course name");
				String cname = sc.next();
				System.out.println("Please enter course id");
				int cid = sc.nextInt();
				System.out.println("Please enter course semester");
				String csem = sc.next();
				CourseData c = new CourseData(cname,cid,csem);
				//find student in roster
				int index=0;
				for(int i=0;i<roster.size();i++) {
					if(roster.get(i).getName().equals(new_name)) {
						index=i;
					}
				}
				roster.get(index).addCourse(c);
				
				
				
				
			}
			else {
				System.out.println("Student is not enrolled.");
				break;
			}
			
			break;
		}
		
		case 3:{
			
			for(StudentData r:roster) {
				System.out.println(r);
			}
			
			break;
		}
		
		case 4:{
			System.out.println("Please enter the ID of the student you want to remove.");
			int id = sc.nextInt();
			int index=0;
			String name="";
			for(int i=0;i<roster.size();i++) {
				if(roster.get(i).getId()==id) {
					index=i;
					name = roster.get(i).getName();
				}
			}
			
			roster.remove(index);
			for(int i=0;i<roster_names.size();i++) {
				if(roster_names.get(i).equals(name)) {
					roster_names.remove(i);
				}
			}
			break;
		}
		
		case 5:{
			break;
		}
		
	
		}
		
		System.out.println("This concludes the action. Click 1 to continue. 0 to exit.");
		int n1=sc.nextInt();
		if(n1==0)
			break;
		
		


	}
		System.out.println("End.");

}}
