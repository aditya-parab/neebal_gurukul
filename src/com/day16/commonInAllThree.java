package com.day16;

import java.util.Arrays;
import java.util.HashSet;

public class commonInAllThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2,3,4,5,6,7};
		int [] arr2 = {2,4,5};
		int [] arr3 = {1,2,7};
		
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		HashSet<Integer> set3 = new HashSet<>();
		for(int a: arr1) {
			set1.add(a);
		}
		for(int a: arr2) {
			set2.add(a);
		}
		for(int a: arr3) {
			set3.add(a);
		}
		
		set1.retainAll(set2);
		set1.retainAll(set3);
		
		System.out.println((set1));
		
		
		
	}

}
