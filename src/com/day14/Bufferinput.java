package com.day14;

import java.io.*;
public class Bufferinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis=new BufferedInputStream(System.in);   
//		try {
//			System.out.println("Enter input");
//			int a = bis.read();
//			System.out.println("input was "+a );
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.err.println("Error in i/p");
//		}
		
		try {
			byte [] b = new byte[5];
			 bis.read(b); //bis reads and stores in b
			 
			 System.out.println(b);
		} catch (Exception e) {
			System.err.println("Error in i/p  ");
		}
	}

}
