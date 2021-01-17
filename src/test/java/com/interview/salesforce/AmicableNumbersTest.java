package com.interview.salesforce;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class AmicableNumbersTest {
	private static AmicableNumbers underTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		underTest = new AmicableNumbers();
	}

	@Test
	public void test() {
		assertTrue(underTest.isAmicable(220, 284));
	}

}
