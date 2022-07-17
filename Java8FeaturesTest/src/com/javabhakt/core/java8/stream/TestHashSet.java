package com.javabhakt.core.java8.stream;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {

		// Creating a new HashSet for iteration
		HashSet<Integer> set = new HashSet<>();

		// Add data to HashSet
		set.add(10);
		set.add(20);

		// Duplicates not allowed in HashSet, so avoid by
		// HashSet
		set.add(10);
		set.add(50);

		// Duplicates not allowed in HashSet, so avoid by
		// HashSet
		set.add(50);

		// Create a iterator of type integer to iterate
		// HashSet
		Iterator<Integer> it = set.iterator();

		System.out.println("Iterate HashSet using iterator : ");

		// Iterate HashSet with the help of hasNext() and
		// next() method
		while (it.hasNext()) {

			// Print HashSet values
			System.out.print(it.next() + " ");

		}

	}
}