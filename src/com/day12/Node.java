package com.day12;


public class Node<T extends Comparable<T>>{
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

