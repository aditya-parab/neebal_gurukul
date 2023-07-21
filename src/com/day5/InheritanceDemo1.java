package com.day5;
class Person{
	protected String name;
	protected int age;
	
	Person(){}
	
	Person(String n,int a){
		name=n;
		age=a;
	
	
   }
	
	int getAge() {
		
		return this.age;
	}
	
	String getName() {
		return this.name;
	}
	
	public String toString() {
		return ("Name:"+ name+  " age: "+age);
	}
	
	
	
}
class Employee extends Person{
	

int id;
	double sal;
	
	Employee(){
		super();
	}
      Employee(String name, int age,int id, double sal) {
		//this.name=name;
		//this.age=age;
		super(name,age);
		this.id=id;
		this.sal=sal;
		//super(name,age);
	}
	public String  toString() {
	//System.out.println("Name:"+ name+  " "+age);
	   // super.print();	
		return super.toString()+ (id+" "+ sal);
	}
}
class Student extends Person{
	
	int roll;
	
	Student(String name,int age,int roll){
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" roll: "+roll;
	}

	
	
	
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person x=new Person("Ravi", 20);
		//x.print();
		System.out.println(x);
		Employee y=new Employee("Ram", 20,101,20000);
		//y.set("Ram", 20,10,200000);
		//y.set(101, 20000);
		//y.print();
		System.out.println(y);
		
		Student z=new Student("Zaiba", 30,120);
		
		System.out.println(z);
		if(z.getAge()>y.getAge()) {
			System.out.print(z.getName()+" is elder");}
			else
				System.out.println(y.getName()+ "is elder");
		}
		

	}



