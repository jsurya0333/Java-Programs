package StreamsInterviewCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWords {

	public static void main(String[] args) {
		String str = "Java Stream API in Java helps in processing stream in in Java";

    Map<String, Long> wordCount = Arrays.stream(str.split("\\s+"))
                                        .map(String::toLowerCase)
                                        .collect(Collectors.groupingBy(
                                                c->c, Collectors.counting()))
                                        .entrySet()
                                        .stream()
                                        .filter(x -> x.getValue() > 1)
                                        .collect(Collectors.toMap(Map.Entry::getKey,
                                        							 Map.Entry::getValue));
    						System.out.println(wordCount);
    ///////////////////////////////////////////////////////////////
    						//First duplicate in sentence
    					String strs = "java is is fun java";

    						Set<String> seen = new HashSet<>();

    						String firstDuplicate =
    								Arrays.stream(strs.split("\\s+"))
    								        .map(String::toLowerCase)
    										.filter(word -> !seen.add(word))   // add returns false for duplicates
    										.findFirst()
    										.orElse(null);

    							System.out.println("firstDuplicateWord ="+firstDuplicate);
    							
    		//=>\\s → means any whitespace (space, tab, newline) //+ → means one or more times
	}

}
