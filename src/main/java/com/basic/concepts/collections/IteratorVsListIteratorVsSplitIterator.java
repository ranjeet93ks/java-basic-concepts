package com.basic.concepts.collections;

import java.util.*;

public class IteratorVsListIteratorVsSplitIterator {

	// Iterator :- used to transverse over collections e.g list,set n others .
	// It transverse only in forward direction //Serial Processing
	// Size of the Iterator is always unknown.

	// ListIterator :- used to tranvesre over list, transverse in forward n backward
	// direction

	// SplitIterator :- used to transverse over collection, arrays n streams in
	// parallel -> Parallel Processing
	// But, Spliterator can provide you the exact size (getExactSizeIfKnown()
	// method) or at least an estimate size (estimateSize() method).

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Kishan");
		names.add("Radha");
		names.add("Shankar");
		names.add("Ganesh");

		// Getting Spliterator
		Spliterator<String> namesSpliterator = names.spliterator();
		// Traversing elements
		namesSpliterator.forEachRemaining(System.out::println);

		System.out.println("------>>");
		// Getting iterator
		Iterator<String> namesIterator = names.iterator();
		// Traversing elements
		namesIterator.forEachRemaining(System.out::println);

		System.out.println("------------>>>---->>");
		// Getting listIterator
		ListIterator<String> namesListIterator = names.listIterator();
		// Traversing elements
		namesListIterator.forEachRemaining(System.out::println);

	}

}
