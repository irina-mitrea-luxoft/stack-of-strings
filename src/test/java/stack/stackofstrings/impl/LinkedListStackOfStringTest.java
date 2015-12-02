package stack.stackofstrings.impl;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import stack.stackofstrings.api.StackOfStrings;
import stack.stackofstrings.impl.LinkedListStackOfStrings;

public class LinkedListStackOfStringTest {

	private static final String NODE1 = new String("Node1");
	private static final String NODE2 = new String("Node2");
	private static final String NODE3 = new String("Node3");
	private static final String NODE4 = new String("Node4");
	
	@Test
	public void testStack() throws IOException{	
		StackOfStrings stackLinked = new LinkedListStackOfStrings();
		stackLinked.push(NODE1);
		stackLinked.push(NODE2);
		stackLinked.push(NODE3);
		stackLinked.push(NODE4);
		
		String stringCompared = NODE4 + NODE3 + NODE2 + NODE1;
		assertEquals(stringCompared, stackLinked.toString());	
		
		assertEquals(NODE4, stackLinked.pop());
		assertEquals(NODE3, stackLinked.pop());
		
		assertEquals(2, stackLinked.getSize());
		
		assertEquals(NODE2 + NODE1, stackLinked.toString());
		
		assertEquals(NODE2, stackLinked.pop());
		assertEquals(NODE1, stackLinked.pop());
		
		assertEquals(0, stackLinked.getSize());

	}
	
}
