package com.day9;

public class Assignment_day9_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		char [] arr = s1.toCharArray();
		String ans="";
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				char t = arr[j];
				arr[j] = arr[(j+1)%arr.length];
				arr[(j+1)%arr.length] = t;
				
			}
			String check = "";
			for(int k=0;k<arr.length;k++) {
				check+=arr[k];
			}
			
			
			
			if(!(check.equals(s1))) {
				System.out.println(check);
			
			}
			
			
		}
	}

}
