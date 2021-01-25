package com.leetcode.general.hard;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.general.hard.FindMedianFromDataStream;

public class FindMedianFromDataStreamTest {

	@Test
	public void test() {
		FindMedianFromDataStream underTeDataStream = new FindMedianFromDataStream();
		underTeDataStream.addNum(1);
		underTeDataStream.addNum(2);
		assertEquals(Double.valueOf(1.5), Double.valueOf(underTeDataStream.findMedian()));
	}

}
