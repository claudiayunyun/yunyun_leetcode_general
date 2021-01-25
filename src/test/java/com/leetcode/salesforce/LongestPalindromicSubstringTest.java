package com.leetcode.salesforce;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class LongestPalindromicSubstringTest {
	private static LongestPalindromicSubstring underTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		underTest = new LongestPalindromicSubstring();
	}

	@Test
	public void test() {
		String input = "babad", output = "bab";
		assertEquals(output, underTest.longestPalindrome(input));
	}
	
	@Test
	public void test2() {
		String input = "cbbd", output = "bb";
		assertEquals(output, underTest.longestPalindrome(input));
	}
	
	@Test
	public void test3() {
		String input = "a", output = "a";
		assertEquals(output, underTest.longestPalindrome(input));
	}
	
	@Test
	public void test4() {
		String input = "ac", output = "a";
		assertEquals(output, underTest.longestPalindrome(input));
	}

}
