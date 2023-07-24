package com.day8;

import java.util.*;



class StudentData{
	String name;
	int id;
	ArrayList<String> courseList = new ArrayList<String>();
	
	public StudentData() {
		// TODO Auto-generated constructor stub
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

	public ArrayList<CourseData> getCourseList() {
		return courseList;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: "+name+" id: "+id+" courseList: "+courseList;
	}


	
}


class CourseData{
	int id;
	String name;
	String semester;
	
	public CourseData() {
		// TODO Auto-generated constructor stub
	}
	
	CourseData(int id, String name, String semester){
		this.id = id;
		this.name = name;
		this.semester=semester;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
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
		System.err.println("4. Remove the student from the list using ID");
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
				System.out.println("Please enter course name");
				String cname = sc.next();
				//find student in roster
				int index=0;
				for(int i=0;i<roster.size();i++) {
					if(roster.get(i).getName()==new_name) {
						index=i;
					}
				}
				roster.get(index).courseList.add(cname);
				
				
				
				
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
