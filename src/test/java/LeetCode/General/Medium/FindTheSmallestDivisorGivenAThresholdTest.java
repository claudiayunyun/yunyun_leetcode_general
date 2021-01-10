package LeetCode.General.Medium;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FindTheSmallestDivisorGivenAThresholdTest {
	private FindTheSmallestDivisorGivenAThreshold underTest;
	
	@Before
	public void setup() {
		underTest = new FindTheSmallestDivisorGivenAThreshold();
	}

	@Test
	public void test() {
		int[] nums = {1,2,5,9};
		int threshold = 6;
		assertEquals(5, underTest.smallestDivisor(nums, threshold));
	}
	
	@Test
	public void test2() {
		int[] nums = {2,3,5,7,11};
		int threshold = 11;
		assertEquals(3, underTest.smallestDivisor(nums, threshold));
	}
	
	@Test
	public void test3() {
		int[] nums = {19};
		int threshold = 5;
		assertEquals(4, underTest.smallestDivisor(nums, threshold));
	}

}
