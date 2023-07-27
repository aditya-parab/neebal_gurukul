package com.day9;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_day9_8 {
	
	

	public  static int[] countPalindromeLength(int left, int right, String s) {
		
	
		int flag=0;

		int h1=right;
		int l1=left;
//		System.out.println(l1);
//		System.out.println(h1);	
		while(l1<h1-1) {
			if(s.charAt(l1)!=s.charAt(h1)) {//characters dont match; cant be palindrome
				flag=1;
				break;
			}
			
			l1++;
			h1--;
		}
		if(flag==0) { //all characters matched
//			return right-left+1;
			return new int [] {right,left+1};
		}
		else {
//			return 0;
			return new int [] {0,0};
		}
	}
	
	public static void main(String[] args) {
		int[] count= {0,0};
		int [] res= {0,0};
		
		// TODO Auto-generated method stub
		System.out.println("please enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		String s = "aabaa";
		
		int maxcount=0;
//		System.out.println(countPalindromeLength(0, 4, s));
		for(int i=0;i<s.length();i++) {
		
			for(int j=i;j<s.length();j++) {
				if((j-i-1)%2==0)
				count=countPalindromeLength(i,j, s);
				else {
					count=countPalindromeLength(i, j-1, s);
				}
				
				if(count[1]-count[0]+1>maxcount) {
					res[0]=count[0];
					res[1]=res[1];
				}

//				maxcount = Math.max(count,maxcount);
				
			}
			
		}
		
		if((s.length()-1)%2==0) {
			System.out.println(""+s.substring(res[1], res[0]));
		}
//		System.out.println(maxcount+1);
//			System.out.println(Arrays.toString(res));
		else {
			System.out.println(""+s.substring(res[1], res[0]));
		}
		
		

	}

}
