package com.day4;


public class Complex {
	double real;
	double imag;
	public Complex() {
		// TODO Auto-generated constructor stub
	}
	
	Complex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	
	Complex add(Complex t) {
		double real1 = this.real;
		double imag1 = this.imag;
		double real2 = t.real;
		double imag2 = t.imag;
		
		return new Complex(real1+real2,imag1+imag2);
	}
	
	Complex sub(Complex t) {
		double real1 = this.real;
		double imag1 = this.imag;
		double real2 = t.real;
		double imag2 = t.imag;
		
		return new Complex(real1-real2,imag1-imag2);
	}
	
	Complex mul(Complex t) {
		double real1 = this.real;
		double imag1 = this.imag;
		double real2 = t.real;
		double imag2 = t.imag;
		
		return new Complex(real1*real2-imag1*imag2,real1*imag2+real2*imag1);
	}
	
	Complex div(Complex t) {
		double real1 = this.real;
		double imag1 = this.imag;
		double real2 = t.real;
		double imag2 = t.imag;
		
		return new Complex((real1*real2+imag1*imag2)/(real2*real2+imag2*imag2),(imag1*real2-real1*imag2)/(real2*real2+imag2*imag2));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String realSign= "+";
		String imagSign = "-";
		
		if (this.real<0)
			realSign="";
		
			
		return this.real+realSign+this.imag+"i";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Complex x=new Complex(3,4);
        Complex y=new Complex(4,5);
        Complex a=x.add(y);
        Complex s=x.sub(y);
        Complex m=x.mul(y);
        Complex d=x.div(y);
        System.out.println(x); //3+i4
        System.out.println(y); //4+i5
        System.out.println(a);//7+i9
        System.out.println(s);//-1-i
        System.out.println(m);//-8+i31
        System.out.println(d);//.78+i0.02

	}

}

