package com.leetcode.general.easy;

public class MergeTwoSortedListsRecursion {
	
	  // Definition for singly-linked list.
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	  
	  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		  /*
		   * resursion
		   */
//		  if(l1 == null) return l2;
//		  else if(l2 == null) return l1;
//		  else if(l1.val < l2.val) {
//			  l1.next = mergeTwoLists(l1.next, l2);
//			  return l1;
//			  }
//		  else {
//			  l2.next = mergeTwoLists(l1, l2.next);
//			  return l2;
//		  }
		  
		  /*
		   * iteration
		   */
		  
		  ListNode start = new ListNode(-1);
		  ListNode current = start;
		  while(l1 != null && l2 != null) {
			  if(l1.val < l2.val) {
				  current.next = l1;
				  l1 = l1.next;
			  } else {
				  current.next = l2;
				  l2 = l2.next;
			  }
			  current = current.next;
		  }
	      
		  if(l1 == null) {
			  current.next = l2;
		  } else {
			  current.next = l1;
		  }
		  
		  return start.next;
	  }
	 
}
