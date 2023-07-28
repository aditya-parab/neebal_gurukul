//
package com.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_day9_17 {
	static ArrayList<String> ans1 = new ArrayList<String>();
	static ArrayList<String> ans2 = new ArrayList<String>();
	
	public static void findAllSubsequences(String s,String a,ArrayList<String> ans){

		if(s.length()==0)
		{
			ans.add(a);
			return;
		}
//		ArrayList<String> with = new ArrayList<String>();
		findAllSubsequences(s.substring(1),a+ s.charAt(0)+"",ans);
	
		
	
		findAllSubsequences(s.substring(1), a,ans);
	
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first string");
		String s1 = sc.next();
		
		System.out.println("Please enter second string");
		String s2 = sc.next();
//		String s1 = "aggtab";
//		String s2 = "gxtxayb";
		

		//find all possible subsequences
		findAllSubsequences(s1,"",ans1);
		
//		for(String a1:ans1) {
//			if(a1.equals(s2))
//				System.out.println(a1);
//		
//		}
		
	
		findAllSubsequences(s2,"",ans2);
//		for(String a2:ans2) {
//		
//			if(a2.equals(s1)) {
//				
//				System.out.println(s1);
//			}
//				
////			
//		
//		}
		String soln="";
		soln="2";
		
		int maxlen=0;
		for(int i=0;i<ans1.size();i++) {
			for(int j=0;j<ans2.size();j++) {
				if(ans1.get(i).equals(ans2.get(j))) {
//					System.out.println(ans1.get(i).length());
					if(ans1.get(i).length()>maxlen) {
						maxlen=ans1.get(i).length();
						
					soln=ans1.get(i);}
					
					}
					
				}
				
			}
		
		System.out.println(soln);
		
		
		
}}
		
		

