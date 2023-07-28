package com.day12;

class Node<T extends Comparable<T>>{
	private T data;
	private Node<T> next;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}

class LinkedList<T extends Comparable<T>>{
	private Node<T> first=null;
	void add(T data) {
		Node<T> newnode=new Node<T>(data,null);
		if(first==null) {
			first=newnode;
		}
		else
		{
			Node<T> temp=first;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newnode);
		}
	}
	public String toString() {
		String msg="[";
		Node<T> temp=first;
		while(temp!=null) {
		if(temp.getNext()!=null)
		msg+=(temp.getData()+" ");
		else {
			msg+=(temp.getData()+"");
		}
		temp=temp.getNext();
		}
		msg+="]";
		return msg;
	}
	
	//counts the number of nodes
	public int count() {
		Node<T> curr = first;
		int i =0;
		while(curr!=null) {
			i++;
			curr=curr.getNext();
		}
		return i;
	}
	
	//finds the largest
	public T max() {
		Node<T> curr = first;
		T max = curr.getData();
		while(curr!=null) {
			if(max.compareTo(curr.getData())<0)
				max=curr.getData();
			curr=curr.getNext();
		}
		return max;
	}

	//inserts a node after the given node
	public boolean insert(T data, T afterdata) {
		Node<T> curr=first;
		Node<T> newNode = new Node(afterdata,null );
		while(curr.getNext()!=null) {
			if (curr.getData()==data) {
				Node<T> storeNext = curr.getNext();
				
				curr.setNext(newNode);
				curr=curr.getNext();
				curr.setNext(storeNext);
				return true;
			}
			else {
				curr=curr.getNext();	
			}
			
		}
		return false;
		
	}
	
	//delete the given data
	public boolean delNode(T data) {
		Node<T> curr=first;
		while(curr.getNext()!=null) {
			while(curr.getNext().getData().compareTo(data)==0) {
				curr.setNext(curr.getNext().getNext());
			}
			curr=curr.getNext();
			
		}
		return true;
		
	}
	
	//reverse the list
	void reverse() {
		Node<T> curr = first;
		Node<T> nextNode = first;
		Node<T> prev = null;
		while(curr!=null ) {
		nextNode=nextNode.getNext();
		curr.setNext(prev);
		prev=curr;
		curr=nextNode;
		
		}
		first=prev;
		return;
		
	}
	
	//inserts the element at the given index
	public boolean insertAt(T data, int index) {
		Node<T> newNode = new Node<T>(data, null);
		int i=0;
		Node<T> curr = first;
		while(curr.getNext()!=null) {
			if(i==0) {
				newNode.setNext(first);
				first=newNode;
				return true;
			}
			
			if(i==index) {
			
			Node<T> nextNode = curr.getNext();
			curr.setNext(newNode);
			newNode.setNext(nextNode);
			}
			i++;
			curr=curr.getNext();
			
		}
		return true;
		
	}

	
}
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> x=new LinkedList<Integer>();
x.add(10);
x.add(20);
x.add(30);
x.add(40);
System.out.println(x);
System.out.println(x.insert(30, 50));
System.out.println(x);
x.delNode(50);
System.out.println(x);
x.insertAt(90, 0);
System.out.println(x);
x.reverse();
System.out.println(x);

	}

}
