package com.day11;

public class Assignment_day11_3 {
	
	public static void permute(char[] a,int index) {
		if(index==a.length-1) {
			System.out.println(a);
			return;
		}
		else {
			
			//swap
			for(int i=index;i<a.length;i++) {
				
					char t = a[index];
					a[index]=a[i];
					a[i]=t;
					permute(a,index+1);
//					t = a[index];
//					a[index]=a[i];
//					a[i]=t;
				
				
			}
		
			
			
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		char [] ch=s.toCharArray();
		permute(ch,0);
	}

}
