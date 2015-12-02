package com.stackofstrings.stack.impl;

import com.stackofstrings.stack.api.StackOfStrings;

public class LinkedListStackOfStrings implements StackOfStrings{

	private int sizeOfStack = 0;
	private Node first = null;
	
	class Node{
		String item;
		Node next;
	}

	@Override
	public void push(String name) {
		Node oldfirst = first;
		first = new Node();
		first.item = name;
		first.next = oldfirst;
		sizeOfStack++;
		System.out.println("Pushed " + name + " to LinkedListStack");
	}

	@Override
	public String pop() {
		String poppedElement = first.item;
		first = first.next;
		sizeOfStack--;
	    System.out.println("Popped " + poppedElement + " to LinkedListStack");
	    return poppedElement;
	}
	
	@Override
	public String toString() {
		Node first = this.first;
		StringBuilder stackContents = new StringBuilder();
		while (first != null) {
			stackContents.append(first.item);
			first = first.next;
		}
		return stackContents.toString();
	}

	@Override
	public int getSize() {
		return sizeOfStack;
	}
	
	
	
}
