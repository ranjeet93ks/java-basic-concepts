package com.basic.concepts.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		stack.push("3");

		System.out.println(stack);// [1, 2,3]

		stack.add("4");
		System.out.println(stack);// [1, 2, 3,4]

		int value0 = Integer.parseInt(stack.get(0));
		System.out.println(value0);// 1

		stack.pop();
		System.out.println(stack);// [1, 2,3]

		stack.pop();
		System.out.println(stack);// [1,2]

	}

}
