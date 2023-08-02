//package com.day16;
//
//import java.util.Hashtable;
//import java.util.Set;
//import java.util.Stack;
//
//class Student implements Comparable<Student>{
//	private int roll;
//	String name;
//	int p,c,m;
//	public Student(int roll, String name, int p, int c, int m) {
//		super();
//		this.roll = roll;
//		this.name = name;
//		this.p = p;
//		this.c = c;
//		this.m = m;
//	}
//	public int getRoll() {
//		return roll;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getP() {
//		return p;
//	}
//	public void setP(int p) {
//		this.p = p;
//	}
//	public int getC() {
//		return c;
//	}
//	public void setC(int c) {
//		this.c = c;
//	}
//	public int getM() {
//		return m;
//	}
//	public void setM(int m) {
//		this.m = m;
//	}
//	@Override
//	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + ", p=" + p + ", c=" + c + ", m=" + m + "]";
//	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		
//		return roll-o.roll;
//	}
//	
//}
//class Data{
//	String ch;
//	int count;
//	public String getCh() {
//		return ch;
//	}
//	public void setCh(String ch) {
//		this.ch = ch;
//	}
//	public int getCount() {
//		return count;
//	}
//	public void setCount(int count) {
//		this.count = count;
//	}
//	@Override
//	public String toString() {
//		return "Data [ch=" + ch + ", count=" + count + "]";
//	}
//	public Data(String ch, int count) {
//		super();
//		this.ch = ch;
//		this.count = count;
//	}
//	
//}
// class StudenSetDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Hashtable<Integer,Double> x=new Hashtable<>();
////		x.put(7,10.5);
////		x.put(9,20.9);
////		x.put(2,30.2);
////		x.put(9,40.9);
////		Double d=x.get(9);
////		System.out.println(d);
//		
//		String msg="K4(ON(SO3)2)2";
//		
//
//		Stack<Data> stack=new Stack<>();
//		for(int i=0;i<msg.length();i++) {
//			char ch=msg.charAt(i);
//			System.out.println(ch);
//			if(Character.isLetter(ch)) {
//				    if(Character.isUpperCase(ch))
//					stack.push(new Data(ch+"",1));
//				    
//				    else {
//				    	Data data=stack.pop();
//				    	data.setCh(data.getCh()+ch);
//				    	stack.push(data);
//				    }
//					
//				
//			}
//			else if(Character.isDigit(ch)) {
//				
//				if(stack.peek().equals(")")) {
//					int count=0;
//					Stack<Data> temp=new Stack<>();
//					do {
//						Data data=stack.pop();
//						if(data.getCh().equals(")")){
//							count++;
//						}
//						else if(data.getCh().equals("(")) {
////							temp.push(data);
//							count--;
//						}
//						else {
//							int num=(ch-48);
//							data.setCount(data.getCount()*num);
////							temp.push(data);
//						}
//						temp.push(data);
//						
//					}while(count!=0);
//					while(!temp.isEmpty()) {
//						stack.push(temp.pop());
//					}
//				}
//				else {
//					
//					Data data=stack.pop();
//					data.setCount((ch-48)*data.getCount());
//					
//                     stack.push(data);
//				}
//				
//			}
//			else if(ch=='(') {
//				
//				stack.push(new Data("(",1));
//			}
//			
//			else {
//				stack.push(new Data(")",1));
//				
//			}
//			
//		}
//		
//	Hashtable<String, Data> table=new Hashtable<>();
//	while(!stack.isEmpty()) {
//		
//		Data data=stack.pop();
//		if(table.get(data.getCh())!=null) {
//			String key=data.getCh();
//			int count=data.getCount()+ table.get(key).getCount();
//			data.setCount(count);;
//			
//			table.put(data.getCh(), data);
//		}
//		else
//		{
//			table.put(data.getCh(), data);
//		}
//	}
//		Set<String> keyset=table.keySet();
//		
//		for(String key:keyset) {
//			System.out.println(table.get(key));
//		}
//
//	}
//
//}