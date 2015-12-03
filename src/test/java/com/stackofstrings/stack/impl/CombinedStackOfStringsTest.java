package com.stackofstrings.stack.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stackofstrings.stack.api.StackOfStrings;

/**
 * ArrayList and LinkedList, same test in same class
 */
public class CombinedStackOfStringsTest {

	private static final String NODE1 = new String("Node1");
	private static final String NODE2 = new String("Node2");
	private static final String NODE3 = new String("Node3");
	private static final String NODE4 = new String("Node4");
	private static final String COMPARISON_STRING = NODE4 + NODE3 + NODE2 + NODE1;
	
	@Test
	public void testStack() {		
		StackOfStrings arrayListStack = new ArrayListStackOfStrings();		
		StackOfStrings linkedListStack = new LinkedListStackOfStrings();
		
		performAssertions(arrayListStack);
		performAssertions(linkedListStack);	
	}

	/**
	 * Method performing assertions on the provided stack
	 * @param stack
	 */
	private void performAssertions(StackOfStrings stack) {
		pushAssertions(stack);		
		popAssertions(stack);
	}

	/**
	 * 	Method performing pop assertions on the provided stack
	 * @param stack
	 */
	private void popAssertions(StackOfStrings stack) {
		assertEquals(4, stack.getSize());
		assertEquals(COMPARISON_STRING, stack.toString());
		assertEquals(NODE4, stack.pop());
		assertEquals(3, stack.getSize());
		assertEquals(NODE3, stack.pop());
		assertEquals(2, stack.getSize());
		assertEquals(NODE2 + NODE1, stack.toString());
		assertEquals(NODE2, stack.pop());
		assertEquals(1, stack.getSize());
		assertEquals(NODE1, stack.pop());
		assertEquals(0, stack.getSize());
	}

	/**
	 * Method performing push assertions on the provided stack
	 * @param stack
	 */
	private void pushAssertions(StackOfStrings stack) {
		assertEquals(0, stack.getSize());
		stack.push(NODE1);
		assertEquals(1, stack.getSize());
		stack.push(NODE2);
		assertEquals(2, stack.getSize());
		stack.push(NODE3);
		assertEquals(3, stack.getSize());
		stack.push(NODE4);
	}
}
