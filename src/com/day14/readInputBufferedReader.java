package com.day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readInputBufferedReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 FileReader fileReader
         = new FileReader(
  "Music_list.txt");
		 
		 // Convert fileReader to
	        // bufferedReader
	        BufferedReader buffReader
	            = new BufferedReader(
	                fileReader);
	        
	        while (buffReader.ready()) {
	            System.out.println(
	                buffReader.readLine());
	        }
	        
	        System.out.println();
	}

}
