package com.interview.salesforce;

import java.util.LinkedList;
import java.util.List;

/* From https://www.geeksforgeeks.org/implement-a-stack-using-singly-linked-list/
 * 1 Implement a stack using single linked list concept
 * 2 All the single linked list operations perform based 
 *   on Stack operations LIFO(last in first out) 
 */
public class ImplementStackUsingLinkedList implements ImplementStack{

	/* From: https://www.geeksforgeeks.org/implement-a-stack-using-singly-linked-list/
	 * Stack Operations:
	 * push() : Insert the element into linked list nothing but which is the top node of Stack.
	 * pop() : Return top element from the Stack and move the top pointer to the second node of linked list or Stack.
	 * peek(): Return the top element.
	 * display(): Print all element of Stack.
	 * isEmpty()
	 */
	
	List<String> stack;

	public ImplementStackUsingLinkedList() {
		this.stack = new LinkedList<String>();
	}
	
	@Override
	public void push(String data) {
		this.stack.add(0, data);
	}
	
	@Override
	public String pop() throws Exception{
		return this.stack.remove(0);
	}
	
	@Override
	public String peek() {
		return this.stack.get(0);
	}
	
	@Override
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
		
}
