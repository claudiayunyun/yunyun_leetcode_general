package LeetCode.General.Hard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FirstMissingPositiveTest {

	private FirstMissingPositive underTest;
	
	@Before
	public void setup() {
		underTest = new FirstMissingPositive();
	}
	
	@Test
	public void test() {
		int[] nums = {1,2,0};
		assertEquals(3, underTest.firstMissingPositive(nums));
	}
	
	@Test
	public void test2() {
		int[] nums = {3,4,-1,1};
		assertEquals(2, underTest.firstMissingPositive(nums));
	}
	
	@Test
	public void test3() {
		int[] nums = {7,8,9,11,12};
		assertEquals(1, underTest.firstMissingPositive(nums));
	}

}
