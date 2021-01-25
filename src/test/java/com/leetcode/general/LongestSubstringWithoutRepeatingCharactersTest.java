package com.leetcode.general;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.general.LongestSubstringWithoutRepeatingCharacters;

public class LongestSubstringWithoutRepeatingCharactersTest {
	
	private LongestSubstringWithoutRepeatingCharacters underTest;
	
	@Before
	public void setup() {
		underTest = new LongestSubstringWithoutRepeatingCharacters();

	}
	
	@Test
	public void generalTest() {
		String s = "abcabcbb";
		assertEquals(3, underTest.lengthOfLongestSubstring(s));
	}
	
	@Test
	public void sameLettersTest() {
		String s = "bbbbb";
		assertEquals(1, underTest.lengthOfLongestSubstring(s));
	}
	
	@Test
	public void subStringTest() {
		String s = "pwwkew";
		assertEquals(3, underTest.lengthOfLongestSubstring(s));
	}
	
	@Test
	public void oneLetterStringTest() {
		String s = " ";
		assertEquals(1, underTest.lengthOfLongestSubstring(s));
	}
	
	@Test
	public void duplicateLettersStringTest() {
		String s = "dvdf";
		assertEquals(3, underTest.lengthOfLongestSubstring(s));
	}
	
	@Test
	public void emptyStringTest() {
		String s = "";
		assertEquals(0, underTest.lengthOfLongestSubstring(s));
	}
	@Test
	public void generalOptimalTest() {
		String s = "abcabcbb";
		assertEquals(3, underTest.lengthOfLongestSubstringOptimal(s));
	}
	
	@Test
	public void sameLettersOptimalTest() {
		String s = "bbbbb";
		assertEquals(1, underTest.lengthOfLongestSubstringOptimal(s));
	}
	
	@Test
	public void subStringOptimalTest() {
		String s = "pwwkew";
		assertEquals(3, underTest.lengthOfLongestSubstringOptimal(s));
	}
	
	@Test
	public void oneLetterStringOptimalTest() {
		String s = " ";
		assertEquals(1, underTest.lengthOfLongestSubstringOptimal(s));
	}
	
	@Test
	public void duplicateLettersStringOptimalTest() {
		String s = "dvdf";
		assertEquals(3, underTest.lengthOfLongestSubstringOptimal(s));
	}
	
	@Test
	public void emptyStringOptimalTest() {
		String s = "";
		assertEquals(0, underTest.lengthOfLongestSubstringOptimal(s));
	}

}
