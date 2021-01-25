package com.interview.salesforce;

public class ImplementStackUsingNode implements ImplementStack {
	
	private static class Node {
		String data;
		Node link;
		
		Node(String data) { this.data = data;}
	}

	Node top;
	public ImplementStackUsingNode() {
		this.top = null;
	}

	@Override
	public void push(String element) {
		Node newTopNode = new Node(element);
		newTopNode.link = this.top;
		this.top = newTopNode;
	}

	@Override
	public String pop() throws Exception{
		if(this.top == null) {
			throw new Exception("This is an empty stack");
		}
		String data = this.top.data;
		this.top = this.top.link;
		return data;
	}

	@Override
	public String peek() throws Exception{
		if(this.top == null) {
			throw new Exception("This is an empty stack");
		}
		return this.top.data;
	}

	@Override
	public boolean isEmpty() {
		return this.top == null;
	}

	@Override
	public void display() {
		Node start = this.top;
		while (start != null) {
			System.out.println(start.data);
			start = start.link;
			
		}
		
	}

}
