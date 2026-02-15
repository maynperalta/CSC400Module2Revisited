package main;

import java.util.*;

// Generic Bag (multiset) implementation that allows duplicate elements
class Bag<T> {
// Using List "items" and item type "T"	
	private List<T> items;
//	Constructor to initialize Bag
	public Bag() {
		items = new ArrayList<>();
	}
// Add an item to the Bag	
// IMPROVEMENT: message if null value attempted.	
	public void add(T item) {
		if (item == null) {
			throw new IllegalArgumentException("Null values not allowd.");
		}
		items.add(item);
	}
// Remove an item from the Bag	
	public void remove(T item) {
		items.remove(item);
	}
// Checks if bag contains item
	public boolean contains(T item) {
		return items.contains(item);
	}
// Loop through items list for each item to count number of times item appears
	public int count(T item) {
		int count = 0;
		for(T element : items) {
			if(element.equals(item)) {
				count++;
			}
		}
		return count;
	}
// Print Bag contents	
	public void printBag() {
		System.out.println(items);
	}
// NEW METHOD: return total number of elements in bag (including duplicates)	
	public int size() {
		return items.size();
	}
// NEW METHOD: merge another bag into this bag	
// IMPROVEMENT: use addAll method for efficiency and cleaner code. 	
	public void merge(Bag<T> otherBag) {
		items.addAll(otherBag.items);
	}
// NEW METHOD: create new bag that contains only distinct items from current bag	
// IMPROVEMENT: use Set to ensure distinct bag has no duplicates. 
	public Bag<T> distinct() {
		Bag<T> distinctBag = new Bag<>();
		Set<T> seen = new HashSet<>();
// IMPROVEMENT: if item can be added to set, add to distinct bag. 		
		for (T element : items) {
			if (seen.add(element)) {
				distinctBag.add(element);
			}
		}
		return distinctBag;
	}
}
