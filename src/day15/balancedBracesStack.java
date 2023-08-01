package day15;

import java.util.Stack;

public class balancedBracesStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stk = new Stack<>();
		
		String s = "((ss+2))";
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stk.push(s.charAt(i));
			}
			if(s.charAt(i)==')') {
				if(stk.isEmpty()) {
					System.out.println("Unbalanced");
					System.exit(0);
				}
				stk.pop();
			
			}
		}
		
		if (!stk.isEmpty())
			System.out.println("Unbalanced");
		else {
			System.out.println("Balanced");
		}
		
	}

}
