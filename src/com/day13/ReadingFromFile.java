package com.day13;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 //Creating the File object
	      File file = new File("TraderOneMoves.txt");
	      
	      //Creating a Scanner object
	      Scanner sc = new Scanner(file);
	      
	      //StringBuffer to store the contents
	      StringBuffer sb = new StringBuffer();
	      
	      //Appending each line to the buffer
	      while(sc.hasNextLine()) {
	         sb.append(sc.nextLine()+"\n");
	      }
	      sc.close();
	      System.out.println(sb);
	      
	      String s = sb.toString();
	      String[] arr = s.split("\n");
//	      
//	      int count=0;
//	      for(int i=0;i<arr.length;i++) {
//	    	  arr[i]=arr[i].trim();
//	    	  if(arr[i].equals("BUY"))
//	    	  count++;
//	      }
	      
	      System.out.println(arr[0].split(",")[0]); //printing BUY/SELL 0/1
//	      System.out.println(count);
	   }

	}


