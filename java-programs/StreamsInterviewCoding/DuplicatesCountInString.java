package StreamsInterviewCoding;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesCountInString {

	public static void main(String[] args) {
		String str = "jayaSurya";

Map<Character, Long> duplicates =
		        str.chars()
		           .mapToObj(c -> (char) c)
		           .collect(Collectors.groupingBy(c -> c, Collectors.counting()))//
		           .entrySet()						
		           .stream()
		           .filter(e -> e.getValue() > 1) //==1 for uniqueCharacter     
		           .collect(Collectors.toMap(
		                   Map.Entry::getKey,
		                   Map.Entry::getValue
		           ));
		            System.out.println(duplicates);          //output={a=3, y=2}
		            System.out.println(duplicates.keySet()); //output=[a,y]
	}
}
