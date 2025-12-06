package StreamsInterviewCoding;

import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedDuplicateString {
	public static void main(String[] args) {
	
			String str = "suuryaass";
	
			Map.Entry<Character, Long> mostRepeated =
			        str.chars()
			           .mapToObj(c -> (char) c)
			           .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
			           .entrySet()
			           .stream()
			           .max(Map.Entry.comparingByValue()) // find highest count
			           .orElse(null);
	
			System.out.println(mostRepeated.getValue());//count
			System.out.println(mostRepeated.getKey());//repeated character
		}
}
