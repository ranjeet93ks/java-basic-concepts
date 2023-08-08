package com.basic.concepts.collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>(2 ^ 5);
		Map<String, String> map3 = new HashMap<>(32, 0.80f);
		Map<String, String> map4 = new HashMap<>(map1);

		map1.put("A", "1");
		map1.put("B", "2");
		map1.put("C", "3");
		map1.put("D", "4");
		map1.put("E", "5");

		map1.entrySet().forEach(System.out::print);// A=1B=2C=3D=4E=5

		System.out.println();

		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.print(entry.getKey() + "=" + entry.getValue());// A=1B=2C=3D=4E=5
		}

	}

}
