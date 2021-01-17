package com.interview.salesforce;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImplementStackTest {

	@Test
	public void testPush() throws Exception {
		ImplementStackUsingNode nodeUnderTest = new ImplementStackUsingNode();
		nodeUnderTest.push("string1");
		nodeUnderTest.push("string2");
		assertEquals("string2", nodeUnderTest.peek());
	}
	
	@Test(expected = Exception.class)
	public void testPopException() throws Exception {
		ImplementStackUsingNode nodeUnderTest = new ImplementStackUsingNode();
		nodeUnderTest.pop();
	}
	
	@Test
	public void testPop() throws Exception {
		ImplementStackUsingNode nodeUnderTest = new ImplementStackUsingNode();
		nodeUnderTest.push("string1");
		nodeUnderTest.push("string2");
		nodeUnderTest.pop();
		assertEquals("string1", nodeUnderTest.peek());
	}

}
