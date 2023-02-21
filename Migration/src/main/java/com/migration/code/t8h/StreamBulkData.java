package com.migration.code.t8h;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBulkData {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		Stream<Integer> sequentialStream = myList.stream();

		Stream<Integer> parellarStream = myList.parallelStream();

		// using lambda with Stream api, filter
		Stream<Integer> highNums = parellarStream.filter(p -> p > 1);

		// using lambda in foreach loop
		highNums.forEach(p -> System.out.println("High num parelal" + p));

		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 5);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));
	}
}
