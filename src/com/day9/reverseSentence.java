package com.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		String[] arr= st.split(" ");
		System.out.println(arr.toString());
		String rev="";
	    for(int i=0;i<arr.length;i++){
            rev = arr[i]+" "+rev;
        }
		System.out.println(rev);

	}

}
