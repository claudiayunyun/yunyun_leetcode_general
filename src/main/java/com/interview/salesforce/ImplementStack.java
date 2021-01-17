package com.interview.salesforce;

public interface ImplementStack {
	public void push(String element);
	
	public String pop() throws Exception;
	
	public String peek() throws Exception;
	
	public boolean isEmpty();
	
	public void display();
}
