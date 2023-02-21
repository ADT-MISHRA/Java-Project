package com.migration.code.t8h;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionAPIImprove {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			myList.add(i);
		}

		Iterator<Integer> it = myList.listIterator();
		while (it.hasNext()) {
			it.forEachRemaining(e -> System.out.println("for each remaining" + e));
		}

		// Collection<Integer> coll = myList.removeIf(p -> p == 5);

	}
}
