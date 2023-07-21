package com.day5;

abstract class Shape{
	double x,y;
	Shape(){}
	abstract double area(); //we cannot specify anything here becz user should NOT be able to call Shape's area 
	public Shape(double x, double y) {
		this.x = x;
		this.y=y;
	}
	
	void set(double x, double y) {
		this.x=x;
		this.y=y;
		
	}
	
	
	
	public String toString() {
		return x+" "+y;
	}
}

class Rect extends Shape
{
	Rect(double x, double y){
		super(x,y);
	}
	
	double area() {
		return x*y;
	}
}

class Tri extends Shape{
	double area() {
		return x*y/2;
	}
	
}

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		
		Shape a;//=new Shape(); // can create reference but not object of Shape class because abstract
		//a.set(2, 3);
	   // double ar=a.area();
	   // System.out.println("area"+ar);
		
		Rect r = new Rect(4,5);
		r.set(6,7); //uses rect's set function on 6,7. Rect has its implementation of Shapes set()
		
		double ar = r.area();
		System.out.println("area: "+ar);
		
		Tri t = new Tri();
		t.set(16,17);
		ar = t.area();
		System.out.println("area: "+ar); //136
		
		a=t;  //assigned reference of object t to a
		a.set(20,30); //a now is an object t and so uses Triangle's set function.
		ar = a.area();
		System.out.println("Area: "+ar);//300
		
		a=r;
		a.set(6,60);
		ar=a.area();// uses rectangle set function
		System.out.println("Area: "+ar); //360
		ar = r.area(); //STILL using rectangle set function..
		System.out.println("Area: "+ar); //360

	}

}
