package LeetCode.General;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaximumSubarrayTest {
	
	private MaximumSubarray underTest;
	
	@Before
	public void setup() {
		underTest = new MaximumSubarray();
	}
	
	@Test
	public void maximumSubarryGeneralTest() {
		int[] input = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int expected = 6;
		assertEquals(expected, underTest.maxSubArray(input));
	}
	
	@Test
	public void maximumSubarryOnePositiveNumberTest() {
		int[] input = new int[] {1};
		int expected = 1;
		assertEquals(expected, underTest.maxSubArray(input));
	}
	
	@Test
	public void maximumSubarryOneZeroTest() {
		int[] input = new int[] {0};
		int expected = 0;
		assertEquals(expected, underTest.maxSubArray(input));
	}
	
	@Test
	public void maximumSubarryOneNegativeNumberTest() {
		int[] input = new int[] {-1};
		int expected = -1;
		assertEquals(expected, underTest.maxSubArray(input));
	}
	
	@Test
	public void maximumSubarryOneBigNegativeNumberTest() {
		int[] input = new int[] {-2147483647};
		int expected = -2147483647;
		assertEquals(expected, underTest.maxSubArray(input));
	}

}
