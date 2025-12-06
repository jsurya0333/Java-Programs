package StreamsInterviewCoding;

import java.util.Arrays;
import java.util.List;

public class FlattenandSort {

	public static void main(String[] args) {
		
		List<List<Integer>> nested = Arrays.asList(
		 Arrays.asList(5, 1, 3),
		 Arrays.asList(2, 9),
		 Arrays.asList(4, 7)
		);
		List<Integer> flatSorted = nested.stream()
		 .flatMap(List::stream)
		 .sorted()
		 .toList();
		System.out.println(flatSorted);

	}

}
