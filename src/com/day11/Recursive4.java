package com.day11;

public class Recursive4 {
//	static int max=0;
	public static int max(int x) {
		
		if(x/10==0) {
			return x;
		}
		else {
			int last = x%10;
			int before = x/10;
			if(last>max(before)) {
				return last;
			}
			else {
				return max(before);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(78495));
		

	}

}
