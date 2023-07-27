package com.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_day9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String word = sc.next();
		String ans = "";
        s = s.toLowerCase();
        word = word.toLowerCase();

        int i = 0;
        int count =0;
        while(i != -1){
            i = s.indexOf(word, i);
            if (i != -1) {
                ans+=i+",";
                i++;
                count++;
            }
        }
//        ans+="]";
        System.out.println(ans.substring(0,ans.length()-1));

	}

}
