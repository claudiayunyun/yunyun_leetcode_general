package com.interview.salesforce;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ImplementStackTest {
	private ImplementStackUsingNode nodeUnderTest;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		nodeUnderTest = new ImplementStackUsingNode();
	}

	@Test
	public void testPush() throws Exception {
		nodeUnderTest.push("string1");
		nodeUnderTest.push("string2");
		assertEquals("string2", nodeUnderTest.peek());
	}
	
	@Test(expected = Exception.class)
	public void testPopException() throws Exception {
		nodeUnderTest.pop();
	}
	
	@Test
	public void testPop() throws Exception {
		nodeUnderTest.push("string1");
		nodeUnderTest.push("string2");
		nodeUnderTest.pop();
		assertEquals("string1", nodeUnderTest.peek());
	}

}
