package StreamsInterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		
		List<String> list = List.of("apple", "banana", "orange");
		//String[] list= {"apple", "banana", "orange"};
Map<Character, Long> frequency =
		        		list.stream()
		        			.flatMap(x ->  x.chars()
		                                 .mapToObj(c -> (char) c))
		                                .collect(Collectors.groupingBy(c -> c, 
		                            		        
		                                		Collectors.counting()));

		System.out.println(frequency);
		}
}
