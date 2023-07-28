package com.day12;

class DNode<T extends Comparable<T>>{
	private T data;
	private DNode<T> next;
	private DNode<T> prev;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public DNode<T> getNext() {
		return next;
	}
	
	public DNode<T> getPrevious() {
		return prev;
	}
	public void setNext(DNode<T> next) {
		this.next = next;
	}
	public void setPrevious(DNode<T> prev) {
		this.prev = prev;
	}
	public DNode(T data, DNode<T> next) {
		super();
		this.data = data;
		this.next = next;
	}
	@Override
	public String toString() {
		return "DNode [data=" + data + "]";
	}
	
}

class DoubleLinkedList<T extends Comparable<T>>{
	private DNode<T> first=null;
	
	void add(T data) {
		DNode<T> newnode=new DNode<T>(data,null);
		if(first==null) {
			first=newnode;
		}
		else
		{
			DNode<T> temp=first;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newnode);
			newnode.setPrevious(temp);
		}
	}
	
	public String toString() {
		String msg="[";
		DNode<T> temp=first;
		while(temp!=null) {
		if(temp.getNext()!=null)
		msg+=(temp.getData()+" ");
		else {			//in case we are at the last index we don't append a space
			msg+=(temp.getData()+"");
		}
		temp=temp.getNext();
		}
		msg+="]";
		return msg;
	}
	
	//display in reverse
	public String reversedisplay() {
		DNode<T> curr = first;
		//forward
		while(curr.getNext()!=null) {
			curr=curr.getNext();
		} //reached the end
//		curr=curr.getPrevious();
		String msg="[";
		while(curr!=null) {
			msg+=curr.getData()+" ";
			curr=curr.getPrevious();
		}
		msg+="]";
		return msg;
	}
	
	//delete the given data
	public boolean delNode(T data) {
		DNode<T> curr = first;
		
		while(curr.getNext()!=null) {
			if(curr.getData().compareTo(data)==0) {
				DNode<T> previousNode = curr.getPrevious();
				DNode<T> nextNode = curr.getNext();
				if(previousNode==null) {
					nextNode.setPrevious(null);
					first=nextNode;
					return true;
				}
				previousNode.setNext(curr.getNext());
				nextNode.setPrevious(curr.getPrevious());
				
			
				
				
				
			}
			curr=curr.getNext();
			
		}
		return true;
		
	}
	
}



public class DoubleLinkedListDemo {
	//display and delete

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleLinkedList<Integer> x=new DoubleLinkedList<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		System.out.println(x);
//		System.out.println(x.reversedisplay());
		System.out.println(x.delNode(10));
		System.out.println(x);
	

	}

}
