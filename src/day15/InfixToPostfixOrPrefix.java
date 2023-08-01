package day15;

import java.util.Stack;
//import day15.precedence;

class Expression{
	String exp;
	
	public Expression(String exp) {
		// TODO Auto-generated constructor stub
		this.exp=exp;
	}
	
	String convertPostFix() {
	    String postfix = "";
	    Stack<Character> stk = new Stack<Character>();
	    for (int i = 0; i < exp.length(); i++) {
	        char ch = exp.charAt(i);
	        if (Character.isLetterOrDigit(ch)) {
	            // Operand (variable)
	            postfix += ch;
	        } else if (ch == '(' || stk.isEmpty() || precedence(ch) > precedence(stk.peek())) {
	            // Operator or '('
	            stk.push(ch);
	        } else if (ch == ')') {
	            // Closing parenthesis
	            while (!stk.isEmpty() && stk.peek() != '(')
	                postfix += stk.pop();
	            if (!stk.isEmpty())
	                stk.pop(); // get rid of '(' character
	        } else {
	            // Operator with lower or equal precedence
	            while (!stk.isEmpty() && precedence(ch) <= precedence(stk.peek())) {
	                postfix += stk.pop();
	            }
	            stk.push(ch);
	        }
	    }

	    while (!stk.isEmpty()) {
	        postfix += stk.pop();
	    }
	    return postfix;
	}
	


	
	
	
	

	private int precedence(char op) {
		int val=0;
		switch (op) {
		case '/': {
			val= 10;
			break;
			
		}
		case '*':{
			val=9;
			break;
		}
		case '+':{
			val=8;
			break;
		}
		case '-':{
			val=7;
			break;
		}

		}
		return val;
	}
}



public class InfixToPostfixOrPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression post = new Expression("a+(b*c-d/e)/(f*g)");
		System.out.println(post.convertPostFix());
		
		

	}

}
