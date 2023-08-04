package com.basic.concepts.collections;

import java.util.*;

public class IteratorExample {

	// Iterator :- used to transverse over collections e.g list,set n others .
	// It transverse only in forward direction //Serial Processing
	// Size of the Iterator is always unknown.

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Kishan");
		names.add("Radha");
		names.add("Shankar");
		names.add("Ganesh");

		// Getting iterator
		Iterator<String> namesIterator = names.iterator();
		// Traversing elements
		namesIterator.forEachRemaining(System.out::println);

		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());//print value only iff we comment line 24 else not
		}

	}

}
