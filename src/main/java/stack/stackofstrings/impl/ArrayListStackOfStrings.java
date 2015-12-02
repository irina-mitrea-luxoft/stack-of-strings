package stack.stackofstrings.impl;

import java.util.ArrayList;
import java.util.List;

import stack.stackofstrings.api.StackOfStrings;

/*
 * 
 */
public class ArrayListStackOfStrings implements StackOfStrings{
	
	private List<String> stack = new ArrayList<String>();
	
	@Override
	public void push(String name) {
		stack.add(name);
		System.out.println("Pushed " + name + " to arrayListStack.");
	}
	
	@Override
	public String pop() {
		int lastElement = stack.size() - 1;
		String poppedElement = stack.get(lastElement);		
		stack.remove(lastElement);
		System.out.println("Popped " + poppedElement + " to arrayListStack.");
		return poppedElement;
	}
	
	@Override
	public String toString() {
		StringBuilder stackContents = new StringBuilder();
		for (int i = stack.size()-1; i>=0; i--){
			stackContents.append(stack.get(i));
		}
		return stackContents.toString();
	}
	
	@Override
	public int getSize() {
		return stack.size();
	}

}