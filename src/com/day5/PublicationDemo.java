package com.day5;

class Publication{
	protected String title;
	protected double price;
	
	public double getPrice() {
		return this.price;
	}
	public Publication() {
		// TODO Auto-generated constructor stub
	}
	public Publication(String title,double price) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.price=price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Publication";
	}
}

class Book extends Publication{
	int numPages;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	Book(String title,double price,int numPages){
		super(title,price);
//		this.title = title;//should not because shouldnt repeat code
//		this.price = price; //should not because shouldnt repeat code
		this.numPages = numPages;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return super.toString()+" Book title: "+title;
	}

}

class Movie extends Publication{
	String director;
	String leadActor;
	
	Movie(String title, double price, String director, String leadActor){
//		this.title = title;   //should not because shouldnt repeat code
//		this.price = price;		//should not because shouldnt repeat code
		super(title,price);
		this.director=director;
		this.leadActor = leadActor;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Movie title: "+title;
	}
}

public class PublicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Harry Potter: Prizoner of Azkaban",25.0,500);
		Movie m1 = new Movie("Captain America: Civil War",50.0,"Anthony Russo","Chris Evans");
		
		if(m1.getPrice()>b1.getPrice()){
			System.out.println(m1+" is more expensive");
		}
		else {
			System.out.println(b1+" 00is more expensive");
		}

	}

}
