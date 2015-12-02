package stack.stackofstrings.impl;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import stack.stackofstrings.api.StackOfStrings;
import stack.stackofstrings.impl.ArrayListStackOfStrings;

public class ArrayListStackOfStringsTest {
	
	private static final String NODE1 = new String("Node1");
	private static final String NODE2 = new String("Node2");
	private static final String NODE3 = new String("Node3");
	private static final String NODE4 = new String("Node4");

	@Test
	public void testStack() throws IOException{		
		StackOfStrings stack = new ArrayListStackOfStrings();		
		stack.push(NODE1);
		stack.push(NODE2);
		stack.push(NODE3);
		stack.push(NODE4);
		
		String stringCompared = NODE4 + NODE3 + NODE2 + NODE1;
		assertEquals(stringCompared, stack.toString());	
		
		assertEquals(NODE4, stack.pop());
		assertEquals(NODE3, stack.pop());
		
		assertEquals(2, stack.getSize());
		
		assertEquals(NODE2 + NODE1, stack.toString());
		
		assertEquals(NODE2, stack.pop());
		assertEquals(NODE1, stack.pop());
		
		assertEquals(0, stack.getSize());
	}	
}
