package com.leetcode.salesforce;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MinimumWindowSubstringTest {
	private static MinimumWindowSubstring underTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		underTest = new MinimumWindowSubstring();
	}

	@Test
	public void test() {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		String output = "BANC";
		assertEquals(output, underTest.minWindow(s, t));
	}
	
	@Test
	public void test2() {
		String s = "a";
		String t = "a";
		String output = "a";
		assertEquals(output, underTest.minWindow(s, t));
	}

}
