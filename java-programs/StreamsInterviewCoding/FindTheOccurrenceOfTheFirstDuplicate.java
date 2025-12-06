package StreamsInterviewCoding;
import java.util.*;
import java.util.stream.Collectors;


public class FindTheOccurrenceOfTheFirstDuplicate {

	public static void main(String[] args) {
        String str = "racecarracecar";

        Character c = findFirstDuplicateMedium(str);
        System.out.println(c);

        System.out.println(findTheLargestDuplicateEntry());
        
        
    }

	public static Character findFirstDuplicateBeginner(String str) {
        Set<Character> seen = new HashSet<>();

        return str.chars()                           // Convert string to IntStream of char codes
                .mapToObj(c -> Character.valueOf((char) c))
                .filter(c -> !seen.add(c))         // Filter: keep only chars that can't be added (duplicates)
                .findFirst()                       // Get the first duplicate
                .orElse(null);                     // Return null if no duplicate found
    }

	public static Character findFirstDuplicateMedium(String str) {

         Map<Character, Long> map = str.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.groupingBy(c -> c,LinkedHashMap::new, Collectors.counting()));


         return map.entrySet()
                 .stream()
                 .filter(e -> e.getValue() > 1)
                 .map(e -> e.getKey())
                 .findFirst()
                 .orElse(null);
    }

    public static Character findTheLargestDuplicateEntry() {
        String input = "acaaaaaecaceca";
        
            return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .map(e -> e.getKey())
                    .orElse(null);
    }

}