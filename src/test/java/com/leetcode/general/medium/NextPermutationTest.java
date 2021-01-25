package com.leetcode.general.medium;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.general.medium.NextPermutation;

public class NextPermutationTest {
	
	private NextPermutation underTest;
	
	@Before
	public void setup() {
		underTest = new NextPermutation();
	}

	@Test
	public void test1() {
		int[] nums = {1,3,2};
		underTest.nextPermutation(nums);
		assertArrayEquals(new int[] {2,1,3}, nums);
	}
	
	@Test
	public void test2() {
		int[] nums = {3,2,1};
		underTest.nextPermutation(nums);
		assertArrayEquals(new int[] {1,2,3}, nums);
	}

}
