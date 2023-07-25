package com.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class checkOccuranceinStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String word = sc.next();
		ArrayList<Integer> indexes = new ArrayList<Integer>();
        String lowerCaseTextString = s.toLowerCase();
        String lowerCaseWord = word.toLowerCase();

        int index = 0;
        int count =0;
        while(index != -1){
            index = lowerCaseTextString.indexOf(lowerCaseWord, index);
            if (index != -1) {
                indexes.add(index);
                index++;
                count++;
            }
        }
        System.out.println(count);
		
	}

}
