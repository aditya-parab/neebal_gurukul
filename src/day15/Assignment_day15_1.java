package day15;

import java.util.Stack;

public class Assignment_day15_1 {
	
	
	public static boolean isReverse(String s) {
		Stack<Character> stk = new Stack<Character>();
		int i =0;
		while(i<s.length()) {
			if(s.charAt(i)!='C') {
				stk.push(s.charAt(i));
				i++;
				
			}
			else {
				break;
			}
			
		}
		
		i++;


		while(i<s.length()) {

			if(stk.isEmpty() || s.charAt(i)!=stk.pop()) {
				return false;
			}
			i++;
		}
		
		
		if(stk.isEmpty())
			return true;
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 

		System.out.println(isReverse("ABBACABBA"));
		
		

	}

}
