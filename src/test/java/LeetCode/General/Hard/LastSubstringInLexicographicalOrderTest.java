package LeetCode.General.Hard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LastSubstringInLexicographicalOrderTest {
	private LastSubstringInLexicographicalOrder underTest;
	
	@Before
	public void setup() {
		underTest = new LastSubstringInLexicographicalOrder();
	}

	@Test
	public void test() {
		System.out.println(underTest.lastSubstring("cacb"));
	}

}
