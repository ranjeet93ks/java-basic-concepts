package com.basic.concepts.basics;

public class JavaBasicsExample {

	// the variables a & b are parameters
	public static int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		// the variables x & y are arguments
		int product = multiply(x, y);
		System.out.println(product);

	}

}
