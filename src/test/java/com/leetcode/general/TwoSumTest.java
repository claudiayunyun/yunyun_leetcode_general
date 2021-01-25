package com.leetcode.general;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.general.TwoSum;

public class TwoSumTest {
	
	
	private TwoSum twoSum;
	
	@Before
	public void setup() {
		twoSum = new TwoSum();

	}
	
	@Test
	public void twoSumGeneralTestOne() {
		int[] input = {2, 7, 11, 15};
		int target = 9;
		int[] expecteds = {0, 1};
 		
		int[] output = twoSum.twoSum(input, target);
		
		assertArrayEquals(expecteds, output);
 	} 
	
	@Test
	public void twoSumGeneralTestTwo() {
		int[] input = {3, 2, 4};
		int target = 6;
		int[] expecteds = {1, 2};
 		
		int[] output = twoSum.twoSum(input, target);
		
		assertArrayEquals(expecteds, output);
 	} 
	
	@Test
	public void twoSumTwoSameNumTest() {
		int[] input = {3, 3};
		int target = 6;
		int[] expecteds = {0, 1};
 		
		int[] output = twoSum.twoSum(input, target);
		
		assertArrayEquals(expecteds, output);
 	} 

}
