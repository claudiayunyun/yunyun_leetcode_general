package com.leetcode.general.medium;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.general.medium.KthLargestElementInAnArray;

public class KthLargestElementInAnArrayTest {
	
	private KthLargestElementInAnArray underTest;

	@Before
	public void setup() {
		underTest = new KthLargestElementInAnArray();
	}
	
	@Test
	public void test() {
		int[] input = {3,2,1,5,6,4};
		int k = 2;
		assertEquals(5, underTest.findKthLargest(input, k));
	}
	
	@Test
	public void test2() {
		int[] input = {3,2,3,1,2,4,5,5,6};
		int k = 4;
		assertEquals(4, underTest.findKthLargest(input, k));
	}

}
