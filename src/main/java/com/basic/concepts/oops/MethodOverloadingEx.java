package com.basic.concepts.oops;

import java.io.IOException;

public class MethodOverloadingEx {	

	// Overloaded methods will have same name but different number of arguments or different types of arguments.
	// Method signature is used by the compiler to differentiate the methods.
	// Method signature consist of three things.
	// a) Method name b) Number of arguments c) Types of arguments

	// method overloading
	public static void methodA(int a) {
		System.out.println("methodA(int a)");
	}

	public static void methodA(String a) {
		System.out.println("methodA(String a)");
	}

	// public static String methodA(String a) { //compilation error
	// return a;
	// }

	public static void methodA(int a, int b) {
		System.out.println("methodA(int a , int b)");
	}

	public static void methodA(String a, String b) {
		System.out.println("methodA(String a, String b)");
	}

	public static void methodB(String a) throws IOException {
		System.out.println("methodB(String a)");
	}
	//public static void methodB(String a) throws RuntimeException {//compilation error
	//	System.out.println("methodB(String a)");
	//}
	
	public static void methodC(int a) {
		System.out.println("methodC(int a)");
	}
//	protected static void methodC(int a) { //compilation error
//		System.out.println("methodC(int a)");
//	}
//	default static void methodC(int a) { //compilation error
//		System.out.println("methodC(int a)");
//	}
//	private static void methodC(int a) { //compilation error
//		System.out.println("methodC(int a)");
//	}
	
	
	//conclusion:-
	// no. of inp para and types of para -> responsible for method overloading
	//return type -> nothing to do with method overloading
	//type of exception that method will throws  -> nothing to do with method overloading
	//access modifier -> nothing to do with method overloading
	//Constructors can be overloaded in a similar way as function overloading.
	

	//Ref- https://javaconceptoftheday.com/important-java-interview-questions-on-method-overloading/
	
	//constructor overloading
		public MethodOverloadingEx() {
			
		}
	    public MethodOverloadingEx(int a) {
			
		}		

}
