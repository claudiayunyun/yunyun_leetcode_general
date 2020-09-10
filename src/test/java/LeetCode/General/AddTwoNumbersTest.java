package LeetCode.General;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import LeetCode.General.AddTwoNumbers.ListNode;

public class AddTwoNumbersTest {
	
private AddTwoNumbers addTwoNumbers;
	
	@Before
	public void setup() {
		addTwoNumbers = new AddTwoNumbers();

	}
	
	@Test
	public void addTwoNumbersGeneralTestOne() {
		ListNode lastNodeForL1 = new ListNode(3);
		ListNode middleNodeForL1 = new ListNode(4, lastNodeForL1);
		ListNode l1 = new ListNode(2, middleNodeForL1);
		
		ListNode lastNodeForL2 = new ListNode(4);
		ListNode middleNodeForL2 = new ListNode(6, lastNodeForL2);
		ListNode l2 = new ListNode(5, middleNodeForL2);
		
		ListNode lastNodeExpected = new ListNode(8);
		ListNode middleNodeExpected = new ListNode(0, lastNodeExpected);
		ListNode expected = new ListNode(7, middleNodeExpected);
		
		ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
		while(result.next != null) {
			assertEquals(expected.val, result.val);
			expected = expected.next;
			result = result.next;
		}
	}
	
	@Test
	public void addTwoNumbersGeneralTestTwo() {
		ListNode lastNodeForL1 = new ListNode(8);
		ListNode l1 = new ListNode(1, lastNodeForL1);
		
		ListNode l2 = new ListNode(0);
		
		ListNode lastNodeExpected = new ListNode(8);
		ListNode expected = new ListNode(1, lastNodeExpected);
		
		ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
		while(result.next != null) {
			assertEquals(expected.val, result.val);
			expected = expected.next;
			result = result.next;
		}
	}
	
	@Test
	public void addTwoNumbersOptimalTestOne() {
		ListNode lastNodeForL1 = new ListNode(3);
		ListNode middleNodeForL1 = new ListNode(4, lastNodeForL1);
		ListNode l1 = new ListNode(2, middleNodeForL1);
		
		ListNode lastNodeForL2 = new ListNode(4);
		ListNode middleNodeForL2 = new ListNode(6, lastNodeForL2);
		ListNode l2 = new ListNode(5, middleNodeForL2);
		
		ListNode lastNodeExpected = new ListNode(8);
		ListNode middleNodeExpected = new ListNode(0, lastNodeExpected);
		ListNode expected = new ListNode(7, middleNodeExpected);
		
		ListNode result = addTwoNumbers.addTwoNumbersOptimal(l1, l2);
		while(result.next != null) {
			assertEquals(expected.val, result.val);
			expected = expected.next;
			result = result.next;
		}
	}
	
	@Test
	public void addTwoNumbersOptimalTestTwo() {
		ListNode lastNodeForL1 = new ListNode(8);
		ListNode l1 = new ListNode(1, lastNodeForL1);
		
		ListNode l2 = new ListNode(0);
		
		ListNode lastNodeExpected = new ListNode(8);
		ListNode expected = new ListNode(1, lastNodeExpected);
		
		ListNode result = addTwoNumbers.addTwoNumbersOptimal(l1, l2);
		while(result.next != null) {
			assertEquals(expected.val, result.val);
			expected = expected.next;
			result = result.next;
		}
	}

}
