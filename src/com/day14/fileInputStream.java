//package com.day14;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//
//
//
//public class fileInputStream {
//// write a function to read file and output a input stream. Then pass that into here.
//	public String name(InputStream input) {
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String Filename = "Music_list.txt";
//		try {
//			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(Filename));
//			String fileData="";
//			byte[] data = new byte[10];
//			int bytesRead;
//			while((bytesRead = bis.read(data))!=-1) {
//				fileData+= new String(data,0, bytesRead);
//			}
//			System.out.println(fileData);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		
//	}
//
//}
