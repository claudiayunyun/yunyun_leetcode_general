package LeetCode.General;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CoinChangeTest {
	
	private CoinChange underTest;
	
	@Before
	public void setup() {
		underTest = new CoinChange();
	}
	
	@Test
	public void validCoinChangeGeneralTest() {
		int[] input = new int[] {1, 2, 5};
		int amount = 11;
		int expected = 3;
		assertEquals(expected, underTest.coinChangeNaiveDynamicProgramming(input, amount));
	}
	
	@Test
	public void invalidCoinChangeTest() {
		int[] input = new int[] {2};
		int amount = 5;
		int expected = -1;
		assertEquals(expected, underTest.coinChangeNaiveDynamicProgramming(input, amount));
	}

}
