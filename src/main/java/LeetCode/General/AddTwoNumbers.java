package LeetCode.General;

public class AddTwoNumbers {
	

//	 Definition for singly-linked list.
	 public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode result = new ListNode();
		 ListNode movingPointer = result;
		 while (l1 != null || l2 != null) {

			 int value = (l1 == null ? 0 : l1.val) 
					 + (l2 == null ? 0 : l2.val) 
					+ (movingPointer == null ? 0 : movingPointer.val) ;
			 if(value / 10 != 0) {
				 movingPointer.next = new ListNode(1);
			 } else {
				 if((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
					 movingPointer.next = new ListNode();
				 }
			 }
			 movingPointer.val = value % 10;
			 movingPointer = movingPointer.next;
			 if(l1 != null) l1 = l1.next;
			 if(l2 != null) l2 = l2.next;
		}
		 return result;
	 }
	 
	 
	 public ListNode addTwoNumbersOptimal(ListNode l1, ListNode l2) {
		 ListNode head = new ListNode(0);
		 
		 ListNode p = l1, q = l2, current = head;
		 int carry = 0;
		 
		 while(p != null || q != null) {
			 int sum = (p == null ? 0 : p.val) 
					 + (q == null ? 0 : q.val)
					 + carry;
			 carry = sum / 10;
			 current.next = new ListNode(sum % 10);
			 current = current.next;
			 if(q != null) q = q.next;
			 if(p != null) p = p.next;						 
		 }
		 
		 if(carry > 0) {
			 current.next = new ListNode(carry);
		 }
		 
		 return head.next;
	 }

}
