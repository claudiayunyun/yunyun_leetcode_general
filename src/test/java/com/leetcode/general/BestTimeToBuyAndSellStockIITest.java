package com.leetcode.general;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.general.BestTimeToBuyAndSellStockII;

public class BestTimeToBuyAndSellStockIITest {
	private BestTimeToBuyAndSellStockII underTest;
	
	@Before
	public void setup() {
		underTest = new BestTimeToBuyAndSellStockII();
	}

	@Test
	public void test1() {
		int[] input = {3,3,5,0,0,3,1,4};
		int expected = 6;
		int result = underTest.maxProfit(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void test2() {
		int[] input = {1,2,3,4,5};
		int expected = 4;
		int result = underTest.maxProfit(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void test3() {
		int[] input = {7,6,4,3,1};
		int expected = 0;
		int result = underTest.maxProfit(input);
		assertEquals(expected, result);
	}
	

}
