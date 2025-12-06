package StreamsInterviewCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwosumPairs {
	public static void main(String[] args) {
	
	    int[] arr = {1, 7, 5, 7, -1, 5, 8, 4, 11, 1};
	    int target = 12;

	    Set<String> pairs = new HashSet<>();
	    
	    Arrays.stream(arr)
	       		.forEach(a ->
	       					 Arrays.stream(arr)
	       					 .filter(b -> a + b == target)
	       					 .forEach(b -> pairs.add(a + "," + b))
	       				);
	    pairs.forEach(x->System.out.println(x));
	    
//	    List<Integer> list = List.of(1, 7, 5, 7, -1, 5, 8, 4, 11, 1);
//	    int targets = 12;
//
//	    Set<String> pairss = new HashSet<>();
//
//	    list.forEach(a ->
//	        list.stream()
//	            .filter(b -> a + b == targets)
//	            .forEach(b -> pairss.add(a + "," + b))
//	    );
//
//	    pairss.forEach(System.out::println);

	    

	}
	
}

