package com.github;

public class Github {
	
	
	
	public void determineEven(int num) {
		if (num % 2 == 0) {
			System.out.println("it is an even number");
		} else {
			System.out.println("it is an odd number");
		}

	}
	public static void main(String[] args) {
		Github obj = new Github();
		obj.determineEven(2);
	}
}