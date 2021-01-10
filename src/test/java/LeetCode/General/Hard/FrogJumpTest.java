package LeetCode.General.Hard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrogJumpTest {
	private FrogJump underTest;
	
	@Before
	public void setup() {
		underTest = new FrogJump();
	}
 
	@Test
	public void test1() {
		int[] stones = {0,1,3,5,6,8,12,17};
		assertTrue(underTest.canCross(stones));
	}
	
	@Test
	public void test2() {
		int[] stones = {0,1,2,3,4,8,9,11};
		assertFalse(underTest.canCross(stones));
	}

}
