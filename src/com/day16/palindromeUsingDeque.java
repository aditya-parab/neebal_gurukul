package com.day16;

import java.util.ArrayDeque;
import java.util.Deque;

public class palindromeUsingDeque {
//	   Deque<Character> dq = new ArrayDeque<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Character> dq = new ArrayDeque<>();

		String s = "aabaa";
		
		for(int i=0;i<s.length();i++) {
			dq.addFirst(s.charAt(i));
		}
		boolean flag = true;
		while(dq.size()>1) {
			if(dq.pollFirst()!=dq.pollLast()) {
				
				flag=false;		
				break;
			}
		}
		System.out.println(flag);
		
		
		

	}

}
