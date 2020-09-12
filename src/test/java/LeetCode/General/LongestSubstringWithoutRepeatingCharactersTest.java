package LeetCode.General;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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

}
