package LeetCode.General;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrappingRainWaterTest {
	private TrappingRainWater underTest;

	@Before
	public void setup() {
		underTest = new TrappingRainWater();
	}
	
	@Test
	public void test() {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int unit = underTest.trap(height);
		assertEquals(6, unit);
	}
	
	@Test
	public void test2() {
		int[] height = {4,2,0,3,2,5};
		int unit = underTest.trap(height);
		assertEquals(9, unit);
	}
	
	@Test
	public void test3() {
		int[] height = {4,2,3};
		int unit = underTest.trap(height);
		assertEquals(1, unit);
	}

}
