package LeetCode.General;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KdiffPairsInAnArrayTest {
	private KdiffPairsInAnArray underTest;
	
	@Before
	public void setup() {
		underTest = new KdiffPairsInAnArray();
	}

	@Test
	public void test1() {
		int[] nums = {3,1,4,1,5};
		int k = 2;
		int expected = 2;
		int actual = underTest.findPairs(nums, k);
		assertEquals(expected, actual);
 	}
	
	@Test
	public void test2() {
		int[] nums = {1,2,3,4,5};
		int k = 1;
		int expected = 4;
		int actual = underTest.findPairs(nums, k);
		assertEquals(expected, actual);
 	}
	
	@Test
	public void test3() {
		int[] nums = {1,3,1,5,4};
		int k = 0;
		int expected = 1;
		int actual = underTest.findPairs(nums, k);
		assertEquals(expected, actual);
 	}

}
