package StreamsInterviewCoding;
import java.util.*;
import java.util.stream.*;

public class FirstMissingNegative {
    public static void main(String[] args) {
    	int[] arr = {3, -1, -4, 1, 2, -2};

    	// Get negative range
    	int min = Arrays.stream(arr).filter(x -> x < 0).min().orElse(0);
    	int max = Arrays.stream(arr).filter(x -> x < 0).max().orElse(min);

    	// Now iterate from max down to min
    	int firstMissingNegative =
    		    IntStream.rangeClosed(min, max)  // -4 to -1
    		             .boxed()
    		             .sorted(Comparator.reverseOrder())  // reverse: -1, -2, -3, -4
    		             .filter(x -> Arrays.stream(arr).noneMatch(y -> y == x))
    		             .findFirst()
    		             .orElse(0);

    		System.out.println(firstMissingNegative);


    }
}
