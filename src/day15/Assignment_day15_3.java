package day15;

import java.util.Stack;

public class Assignment_day15_3 {
	
	public static int baseballGame(String [] s) {
		int sum=0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<s.length;i++) {
			String ch=s[i];
//			System.out.println(ch);
//			System.out.println(sum);
			if(ch.equals("+")) {
//				System.out.println(stack.peek());
				int val1 = stack.pop();
//				System.out.println(stack.peek());
				int val2 = stack.pop();
				sum=sum+val1+val2;
			
				stack.push(val2); //push back the 2 vals into the stack after adding them
				stack.push(val1);
				stack.push(val1+val2);
				
//				System.out.println(sum);
				
			}
			
			else if(ch.equals("D")) {
//				System.out.println("hii");
				int val = 2*stack.pop();
				sum+=(val);
				stack.push(val);
//				System.out.println(sum);
			}
			
			else if(ch.equals("C")) {
				int val = stack.pop();
				sum-=val;
//				System.out.println(sum);
			}
			
			else{
//				System.out.println("pushed in"+ch);
				stack.push(Integer.parseInt(ch));
				sum+=Integer.parseInt(ch);
//				System.out.println(sum);

			}
			
			
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[]{"5","-2","4","C","D","9","+","+"};
	
		System.out.println(baseballGame(s));

	}

}
