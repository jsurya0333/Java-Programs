package StreamsInterviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		List<String> words = List.of("madam", "apple", "racecar", "level", "cat","carcar");
		//String[] words= {"madam", "apple", "racecar", "level", "cat","carcar"};
		String longestPalindrome =
		        words.stream()
		                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
		                //.findFirst() //first palindrome
		                .max(Comparator.comparing(String::length))
		                .orElse(null);

		System.out.println("LONGEST PALINDROME = " + longestPalindrome);
		
		//first duplicate palindrome
		List<String> wordds = List.of("madam", "apple", "level", "cat", "madam", "noon", "level");

		Set<String> seeen = new HashSet<>();

		String firstDuplicatePalindrome =
		        wordds.stream()
		              .filter(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) // palindrome
		              .filter(x -> !seeen.add(x))  // duplicate check
		              .findFirst()
		              .orElse(null);

		System.out.println("First Duplicate Palindrome: " + firstDuplicatePalindrome);
		
//StringBuilder is a class, not a method.so create object to use method like reverse()
//Converts the StringBuilder back to a normal String.
//Because reverse() returns a StringBuilder, not a String.

	}

}

