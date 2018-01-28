package ExamplesonCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List1 {

	public static void main(String args[]) {

		List<Integer> numbersArrayList = new ArrayList<>();
		long startTime = System.currentTimeMillis();
		System.out.println("Time started by the ArrayList: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		for (int i = 1; i <= 10000000; i++) {
			numbersArrayList.add(i);
		}
		// Inserting values at 10th position
		for (int i = 9; i <= 9000; i += 10) {
			//numbersArrayList.add(i, 18);
			numbersArrayList.remove(i);
			// System.out.println(i);
		}
		System.out.println("Time taken by ArrayList : " + (System.currentTimeMillis() - startTime) + "ms");

		//// Linked List
		List<Integer> numbersLinkedList = new LinkedList<>();
		System.out.println("Time started by the LinkedList: " + (System.currentTimeMillis() - startTime) + "ms");
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i <= 10000000; i++) {
			numbersLinkedList.add(i);
			
			// System.out.println(i);
		}
		// Inserting values at 10th position
		for (int i = 9; i <= 9000; i += 10) {
			//numbersLinkedList.add(i, 18);
			numbersLinkedList.remove(i);
			// System.out.println(i);
		}
		System.out.println("Time taken by LinkedList : " + (System.currentTimeMillis() - startTime1) + "ms");
	}

}
