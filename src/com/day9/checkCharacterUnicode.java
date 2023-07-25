package com.day9;

import java.util.Scanner;

class MyException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "eRROr";
	}
}

public class checkCharacterUnicode {
	
	
	
	public static boolean check (int i) throws MyException{
		
		if(Character.isAlphabetic((char)i)) {
			
			return true;
		}
		if(Character.isDigit((char)i)) {
			
			return false;
		}
		
		else {
			
			throw new MyException();
		}
	}

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		try {
		if(check(i)) {
			System.out.println("char is alphabet");
		}
		if(!check(i)) {
			System.out.println("char is alphabet");
		}
		}
		catch(MyException e) {
			System.out.println("This is a special character");
		}
		

	}

}
