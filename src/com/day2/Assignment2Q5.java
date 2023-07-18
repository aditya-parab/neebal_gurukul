package com.day2;

public class Assignment2Q5 {

	public static void main(String[] args) {
		
		int count=0;
		
		int f = 0;
		int s =1;
		
		for(int i =1; ;i++) {
			if(f%2==0) {
				if(count>10)
					break;
				count+=1;
				System.out.println(f);
			}
			
			int total = f+s;
			f = s;
			s = total;
			
		}

	}

}
