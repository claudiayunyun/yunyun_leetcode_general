package com.leetcode.general.medium;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.general.medium.ThreeSum;

public class ThreeSumTest {
	private static ThreeSum underTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		underTest = new ThreeSum();
	}

	@Test
	public void test() {
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		List<List<Integer>> output = underTest.threeSum(nums);
		for(List<Integer> list : output) {
			System.out.println(list);
		}
	}

}
