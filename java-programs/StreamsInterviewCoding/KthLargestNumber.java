package StreamsInterviewCoding;

import java.util.Comparator;
import java.util.List;

public class KthLargestNumber {

	public static void main(String[] args) {
		List<Integer> list = List.of(10, 3, 5, 20, 20, 8, 7);
		int k = 3;

		Integer kthLargest =
		        list.stream()
		            .sorted(Comparator.reverseOrder()) // sort highest → lowest
		            .distinct()                         // remove duplicates (optional)
		            .skip(k - 1)                        // skip first (k-1) largest values
		            .findFirst()                        // pick next value
		            .orElse(null);

		System.out.println("Kth Largest = " + kthLargest);


	}

}
