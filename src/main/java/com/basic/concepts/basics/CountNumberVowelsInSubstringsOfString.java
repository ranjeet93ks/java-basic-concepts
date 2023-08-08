package com.basic.concepts.basics;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumberVowelsInSubstringsOfString {

	// Driver Code
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a String");
			String str = sc.nextLine();
			System.out.println(vowel_calc(str));
		}
	}

	// calculates total sum of all vowel occurrences in substring of a given string
	static int vowel_calc(String str) {
		int n = str.length();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (i == 0)
				// Number of times the 0th character occurs in all substrings
				arr[i] = n;
			else
				// Number of times the ith character occurs in all substrings
				arr[i] = (n - i) + arr[i - 1] - i;
		}
		System.out.println(Arrays.toString(arr));
		

		int sum = 0;
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			// Check to see if ith character is a vowel
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				sum += arr[i];
		}

		// Return total sum of all vowel occurrences
		return sum;
	}

}