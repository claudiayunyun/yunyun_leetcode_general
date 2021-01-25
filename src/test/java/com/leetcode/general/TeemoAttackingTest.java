package com.leetcode.general;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.general.TeemoAttacking;

public class TeemoAttackingTest {
	private TeemoAttacking underTest;
	
	@Before
	public void setup() {
		underTest = new TeemoAttacking();
	}

	@Test
	public void test1() {
		int[] input = {1,4};
		int duration = 2;
		int expected = 4;
		int actual = underTest.findPoisonedDuration(input, duration);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int[] input = {1,2};
		int duration = 2;
		int expected = 3;
		int actual = underTest.findPoisonedDuration(input, duration);
		assertEquals(expected, actual);
	}
}
