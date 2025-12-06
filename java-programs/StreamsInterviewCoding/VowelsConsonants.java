package StreamsInterviewCoding;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class VowelsConsonants {

	public static void main(String[] args) {
		String str = "Java Programming";

		Set<Character> vowels =
		        str.toLowerCase()
		           .chars()
		           .mapToObj(c -> (char) c)
		           .filter(Character::isLetter)
		           .filter(ch -> "aeiou".indexOf(ch) != -1) //== -1//consonants	
		           .collect(Collectors.toCollection(LinkedHashSet::new));

		System.out.println("Vowels: " + vowels);
	}

}
