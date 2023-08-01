package day15;



import com.day12.*;



import com.day12.LinkedListDemo;
class LinkedListStack<T extends Comparable<T>>{
	
	Node<T> last;
	void push(T data) {
		Node<T> newNode = new Node(data, null);
		if(newNode==null) //JVM ran out of memory for linkedlist
			throw new RuntimeException("stack is full");
		else {
			newNode.setNext(last);
			last = newNode;
		}
	}
	
	T pop() {
		if(last==null)
			throw new RuntimeException("stack is empty");
		else {
			T data = last.getData();
			last = last.getNext();
			return data;
		}
	}
	
	T peek() {
		if(last==null)
			throw new RuntimeException("stack is empty");
		else {
			T data = last.getData();
			
			return data;
		}
	}
	
	boolean isEmpty() {
		return last ==null;
	}
	
	
	
	
	
	
	
	
}

public class LinkedListStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack<Integer> s = new LinkedListStack<>();
		int x=18;
		s.push(20);
		System.out.println();
		System.out.println(s.peek());
		
		
		while(x!=0) {
			s.push(x%2);
			x=x/2;
		}
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
