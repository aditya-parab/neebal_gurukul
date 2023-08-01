package day15;

import java.util.Stack;

public class Assignment_day15_2 {

	
	
	public static String convertPostfixToInfix(String s) {
		Stack<String> stack = new Stack<>();
		String res="";
		
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i)))
				stack.push(""+s.charAt(i));
			else {
				if(stack.isEmpty())
					break;
				String op1 = stack.pop();
				if(stack.isEmpty())
					break;
				String op2 = stack.pop();
				stack.push("("+op2+s.charAt(i)+op1+")");
			}
		}
		res+=stack.pop();
		
		
		return res;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convertPostfixToInfix("ab+cd/-"));

	}

}
