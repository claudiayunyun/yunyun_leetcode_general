package com.leetcode.general;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.general.NumberOfIslands;

public class NumberOfIslandsTest {
	
	private NumberOfIslands underTest;
	
	@Before
	public void setup() {
		underTest = new NumberOfIslands();
	}
	
	@Test
	public void oneIslandTest() {
		char[][] input = new char[][] {
			{'1','1','1','1','0'},
			{'1','1','0','1','0'},
			{'1','1','0','0','0'},
			{'0','0','0','0','0'}
		};
		int expected = 1;
		assertEquals(expected, underTest.numIslands(input));
	}
	
	@Test
	public void multipleIslandsTest() {
		char[][] input = new char[][] {
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}
		};
		int expected = 3;
		assertEquals(expected, underTest.numIslands(input));
	}

}
