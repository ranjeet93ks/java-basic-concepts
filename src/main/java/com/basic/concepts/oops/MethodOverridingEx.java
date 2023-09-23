package com.basic.concepts.oops;

public class MethodOverridingEx {

	public static void main(String[] args) {

	}

}

abstract class Parent {
	abstract void display() throws RuntimeException;

	void show() throws Exception {
	}
}

class Child extends Parent {
	@Override
	void display() throws RuntimeException {
		System.out.println("child class method ");
	}

	// @Override
//	void display() throws Exception{ //compiletime error 
//		System.out.println("child class method ");
//	}
	// Note:- child class method can throw same exception or sub class of the
	// exception thrown by parent class method

}
