package StreamsInterviewCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstDuplicateIntegerandCount {

	public static void main(String[] args) {
		List<Integer> list = List.of(3,3, 5, 2, 5, 7, 3);

		Set<Integer> seen = new HashSet<>();
		
		List<Integer> a=new ArrayList<>();

		Integer firstDuplicate =
		        list.stream()
		            .filter(x -> !seen.add(x))   // if add() returns false → duplicate
		            .findFirst()
		            .orElse(0);

		System.out.println("FIRSTDUPLICATE = "+firstDuplicate); // Output: 5
	
				//1st duplicate using intarray

			int[] b= {88,88,1,1,3,5,7};
			
			Set<Integer> seeen=new LinkedHashSet<>();
			
			Integer miss=Arrays.stream(b)
					.filter(c-> !seeen.add(c))
					.findFirst().orElse(0);
			System.out.println(miss);

			//If you want a list of duplicates only
			
			List<Integer> duplicates =
			        list.stream()
			            .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
			            .entrySet()
			            .stream()
			            .filter(e -> e.getValue() > 1)
			            .map(Map.Entry::getKey)
			            .toList();
			
			System.out.println(duplicates);
			}
			}

