package StreamsInterviewCoding;

import java.util.stream.IntStream;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num = 121;

		boolean isPalindrome =
		        IntStream.range(0, String.valueOf(num).length())
		                 .allMatch(i -> 
		                     String.valueOf(num).charAt(i) ==
		                     String.valueOf(num).charAt(String.valueOf(num).length() - 1 - i)
		                 );

		System.out.println(isPalindrome);   // true
   /////////////////////////////////////////////////////////////////////
		int numm = 121;

		String s = String.valueOf(numm);

		boolean isPalindromes =
		        s.equals(new StringBuilder(s).reverse().toString());

		System.out.println(isPalindromes);   // true


	}

}
