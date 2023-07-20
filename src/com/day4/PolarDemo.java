package com.day4;

class Polar{
	private double r,th;
	
	Polar(){
		
	}
	
	Polar(int r, int th){
		this.r = r;
		this.th = th;
	}
	
	double getX() {
		// TODO Auto-generated method stub
return  (r*Math.cos(Math.toRadians(th)));
	}
	
	double getY() {
		// TODO Auto-generated method stub
return  (r*Math.sin(Math.toRadians(th)));
	}
	
	void setPolar(double x, double y){
		this.r = Math.sqrt((x*x + y*y));
		this.th = Math.atan(y/x);
	}
		
		public String toString() {
			return "r = "+this.r+" th = "+Math.toDegrees(th);
		}
		
		
	}


public class PolarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polar a = new Polar(5,50);
		Polar b = new Polar(6,50);
		Polar c = new Polar();
//		double x = a.getX() + b.getX();
//		double y= a.getY() + b.getY();
		
		
		
		double x3 = a.getX() + b.getX() ;
		double y3 = a.getY() + b.getY() ;
		
		c.setPolar(x3,y3);
 		System.out.println(c);

	}

}
