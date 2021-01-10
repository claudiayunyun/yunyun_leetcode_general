package LeetCode.General;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {
	private BestTimeToBuyAndSellStock underTest;
	
	@Before
	public void setup() {
		underTest = new BestTimeToBuyAndSellStock();
	}

	@Test
	public void test1() {
		int[] input = {7,1,5,3,6,4};
		int expected = 5;
		int result = underTest.maxProfit(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void test2() {
		int[] input = {7,6,4,3,1};
		int expected = 0;
		int result = underTest.maxProfit(input);
		assertEquals(expected, result);
	}

}
