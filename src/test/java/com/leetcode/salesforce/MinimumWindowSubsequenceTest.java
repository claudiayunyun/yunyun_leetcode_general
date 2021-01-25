package com.leetcode.salesforce;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MinimumWindowSubsequenceTest {
	private static MinimumWindowSubsequence underTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		underTest = new MinimumWindowSubsequence();
	}

	@Test
	public void test() {
		String S = "abcdebdde", T = "bde";
		String Output = "bcde";
		assertEquals(Output, underTest.minWindow(S, T));
	}

}
