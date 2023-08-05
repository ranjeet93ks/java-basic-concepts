package com.basic.concepts.basics;

import java.util.*;
import java.util.stream.Collectors;

public class StringRelatedProgram1 {

	public static void main(String[] args) {

		String inp = "aabbccdefghhiijkl113&&**";
		System.out.println(inp);// aabbccdefghhiijkl113&&**
		removeDuplicateUsingJava8(inp);
		removeDuplicateUsingLoop(inp);
		removeDuplicateUsingHashSet(inp);

	}

	// remove duplicate char from a string
	public static String removeDuplicateUsingLoop(String inp) {
		System.out.println("removeDuplicateUsingLoop -->> ");
		int length = inp.length();
		String str = new String();
		for (int i = 0; i < length; i++) {
			char c = inp.charAt(i);
			// if c is present in str, it returns the index of c, else it returns -1
			if (str.indexOf(c) < 0) {
				// adding c to str if -1 is returned
				str += c;
			}
		}

		System.out.println(str);
		return str.toString();

	}

	// remove duplicate char from a string using java8 features
	public static String removeDuplicateUsingJava8(String inp) {
		System.out.println("removeDuplicateUsingJava8 -->> ");
		String[] strArr = inp.split("");
		List<String> strList = Arrays.asList(strArr);
		strList = strList.stream().distinct().collect(Collectors.toList());

		String newStr = String.join("", strList);
		System.out.println(newStr);// abcdefghijkl13&*

		// String newStr1 = String.join("-", strList);
		// System.out.println(newStr1);// a-b-c-d-e-f-g-h-i-j-k-l-1-3-&-*

		return newStr;

	}

	// remove duplicate char from a string using java8 features
	public static String removeDuplicateUsingHashSet(String inp) {
		System.out.println("removeDuplicateUsingHashSet -->> ");
		String[] strArr = inp.split("");

		Set<String> set = new LinkedHashSet<String>();
		for (String c : strArr) {
			set.add(c);
		}

		// String newStr = String.join("", set); //java 8 features
		// System.out.println(newStr);// abcdefghijkl13&*
		// System.out.println(set);
		String newStr = "";

		Object[] strNewArr = set.toArray();
		int length = strNewArr.length;
		for (int i = 0; i < length; i++) {
			newStr += strNewArr[i];
		}
		System.out.println(newStr);
		return newStr;

	}

}
