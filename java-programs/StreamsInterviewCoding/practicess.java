package StreamsInterviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

 public class practicess {
	 
	 public static boolean isArmstrong(int num) {
		    int original = num;
		    int digits = String.valueOf(num).length();

		    int sum = String.valueOf(num)
		                .chars()
		                .map(Character::getNumericValue)
		                .map(d -> (int) Math.pow(d, digits))
		                .sum();

		    return sum == original;
		}
	  
	 public static void main(String...args) {
		 
		 List<Integer> s=List.of(153,56,1974,78);
		 practicess p=new practicess();
		 s.forEach(n ->
         System.out.println(n + " is Armstrong? " + isArmstrong(n))
 );
		 
	 }
	 
	 
	 
 
	
 }
		
		
		

