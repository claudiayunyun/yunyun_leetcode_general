package com.interview.salesforce;

public class AmicableNumbers {
	
	/*
	 * https://www.geeksforgeeks.org/pairs-amicable-numbers/
	 * Two numbers are amicable if the first is equal to the 
	 * sum of divisors of the second, and if the second number 
	 * is equal to the sum of divisors of the first.
	 */

	public boolean isAmicable(int a, int b) {
		return sumOfDivisors(a) == b && sumOfDiv(b) == a;
	}
	
	private int sumOfDivisors(int a) {
		int sum = 1;
		double x = Double.valueOf(a);
		for(int i = 2; i < Math.sqrt(x); i++) {
			if(Math.ceil(x / i) == Math.floor(x / i)) {
				sum += i;
				sum += Math.ceil(x / i);
				if(x / i == i) {
					sum -= i;
				}
			}
		}
		return sum;
	}
	
	private int sumOfDiv(int a) {
		int sum = 1;
		for(int i = 2; i < Math.sqrt(a); i++) {
			if(a % i == 0) {
				sum += i;
				if(a / i != i) {
					sum += a / i;
				}
			}
		}
		return sum;
	}
}
