package com.bridgelabz.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

/**
 * Demo on collection concepts
 * 
 * @author : Snehal Patil
 */
public class JavaCollectionDemo {
	// Method to demonstrate List Demo
	private static void doListDemo() {
		System.out.println("\n------------- List Demo --------------");
		List<String> list = new LinkedList<String>();

		list.add("Ravi");
		list.add("Vjay");
		list.add("Ravi");
		list.add("Ajay");

		System.out.println("\nList elements : ");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	// Method to demonstrate Stack Demo
	private static void doStackDemo() {
		System.out.println("\n--------------- Stack Demo ------------");

		Stack<String> stack = new Stack<String>();

		stack.push("Ravi");
		stack.push("Amit");
		stack.push("Garima");
		stack.push("Ashish");

		System.out.println("\nStack Elements : ");
		for (String element : stack) {
			System.out.println(element);
		}

		String topElement = stack.pop();
		System.out.println("\nPopped Element : " + topElement);
		System.out.println("\nHead : " + stack.peek());

		System.out.println("\nRemaining Stack element : ");
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	// Method to demonstrate Queue demo
	private static void doQueueDemo() {
		System.out.println("\n----------- Queue Demo ------------");

		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");

		System.out.println("\nHead : " + queue.element());
		System.out.println("\nHead : " + queue.peek());

		System.out.println("\nQueue Elememts : ");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		queue.remove();
		queue.poll();

		System.out.println("\nQueue Elememts after removing two elements : ");
		iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	// Method to demonstrate Set Demo
	private static void doSetDemo() {

		System.out.println("\n------------- Set Demo --------------");
		Set<String> set = new LinkedHashSet<String>();

		set.add("Ravi");
		set.add("Vjay");
		set.add("Ravi");
		set.add("Ajay");

		System.out.println("\nIterating using iterator: ");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nIterating using For Loop: ");
		for (String element : set) {
			System.out.println(element);
		}
	}

	// Method to demonstrate Map Demo
	private static void doMapDemo() {

		System.out.println("\n--------------- Map Demo --------------");
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Ravi");
		map.put(99, "Vjay");
		map.put(102, "Ravi");
		map.put(104, "Ajay");

		System.out.println("\nIterating using For Loop: ");
		for (Map.Entry<Integer, String> mapElement : map.entrySet()) {
			System.out.println(mapElement.getKey() + " - " + mapElement.getValue());
		}
	}

	public static void main(String[] args) {
		System.out.println("----------- Welcome to Java Collection Demo -----------");
		// Calling all methods
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();

	}
}
