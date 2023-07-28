package com.day11;
import java.util.Arrays;

public class Assignment_day11_1 {

	
	public static int sum(int[] a) {
		if(a.length<=0)
			return 0;
		
		else {
			return a[a.length-1]+sum(Arrays.copyOfRange(a, 0, a.length-1));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		 int[] a = {1,2,3,4,5};
		System.out.println(sum(a));
	}
}
