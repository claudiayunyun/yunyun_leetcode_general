package com.leetcode.salesforce;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MeetingRoomsIITest {
	
	private static MeetingRoomsII underTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		underTest = new MeetingRoomsII();
	}

	@Test
	public void test() {
		int[][] intervals = new int[][] {
			{1,5}, {8,9}, {8,9}
		};
		assertEquals(2, underTest.minMeetingRooms(intervals));
	}

}
