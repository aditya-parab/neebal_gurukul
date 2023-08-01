package com.day14;

import java.io.IOException;

public class InputStreamExample {
public static void main(String [] args) {
	try {
		System.out.println("Enter input");
		int a = System.in.read();
		System.out.println("Input was "+a);
	} catch (IOException e) {
		// TODO: handle exception
		System.err.println("Error in i/p");
	}
}
}
