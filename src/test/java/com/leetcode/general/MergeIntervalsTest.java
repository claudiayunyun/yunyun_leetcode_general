package com.leetcode.general;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.general.MergeIntervals;

public class MergeIntervalsTest {
	private MergeIntervals underTest;
	
	@Before
	public void setup() {
		underTest = new MergeIntervals();
	}

	@Test
	public void test1() {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] output = {{1,6},{8,10},{15,18}};
		assertTrue(Arrays.deepEquals(output, underTest.merge(intervals)));
 	}

}
