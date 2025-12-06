package StreamsInterviewCoding;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddnumber {
	public static void main(String... args) {
	List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	Map<Boolean, List<Integer>> partition =
	        numbers.stream()
	               .collect(Collectors.partitioningBy(x -> x % 2 == 0));
	
	System.out.println("Even numbers  : " + partition.get(true));
	System.out.println("Odd numbers   : " + partition.get(false));
	
	System.out.println(partition.get(true).size());//count
	System.out.println(partition.get(true).stream().mapToInt(Integer::intValue).sum());//sum
	

	}
}

