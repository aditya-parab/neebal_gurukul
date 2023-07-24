package com.day8;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class LinkDemo implements ListIterator{
	
	 static <T extends AbstractList <?>> void display(T t){ //<T extends AbstractList <?>> explains the type of t
			
		 Iterator <?> it = t.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			
				
			}
		}
	 

	 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1 = new Vector<Integer>(3);
		v1.add(1);
		v1.add(2);
		v1.add(3);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(3);
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		Stack<Double> s1 = new Stack<>();
		s1.add(1.0);
		s1.add(2.0);
		s1.add(3.0);
		
		display( v1);
		display( a1);
		display( s1);
		
		List<String> studentNames = new ArrayList<String>();
		studentNames.add("AA");
		studentNames.add("AB");
		studentNames.add("AC");
		studentNames.add("Ad");
		studentNames.add("AE");
		
		Collections.sort(studentNames);
		
		for(String s:studentNames) {
			System.out.println(s);
		}
		
		
		
			
		}
		
		


		
		

	
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Object e) {
		// TODO Auto-generated method stub
		
	}

}
