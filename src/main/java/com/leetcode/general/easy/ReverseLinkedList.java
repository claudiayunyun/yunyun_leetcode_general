package com.leetcode.general.easy;

public class ReverseLinkedList {


	 // Definition for singly-linked list.
	 public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	 public ListNode reverseList(ListNode head) {
		 ListNode previous = null;
		 ListNode current = head;
		 
		 while(current != null) {
			 ListNode oldNext = current.next;
			 current.next = previous;
			 previous = current;
			 current = oldNext;
		 }
		 
		 return previous;
	        
	 }
	 
}


