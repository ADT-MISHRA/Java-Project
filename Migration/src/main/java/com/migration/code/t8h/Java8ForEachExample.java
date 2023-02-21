package com.migration.code.t8h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String args[]) {

		// creating sample creation
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		// traversing using iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator value ::" + i);
		}

		// traversing through foreach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("foreach anonymous class :: " + t);
			}
		});

		// traversing with consumer interface implementation
		MyConsumer consumer = new MyConsumer();
		myList.forEach(consumer);
	}
}

class MyConsumer implements Consumer<Integer> {
	public void accept(Integer t) {
		System.out.println("Consumer impl value :: " + t);
	}
}