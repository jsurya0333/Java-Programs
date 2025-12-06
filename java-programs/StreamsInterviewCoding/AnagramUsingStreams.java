package StreamsInterviewCoding;
import java.util.Arrays;

public class AnagramUsingStreams {

    public static void main(String[] args) {

        String s1 = "lisTen";
        String s2 = "Silent";

        boolean isAnagram = Arrays.equals (
        		
                        s1.toLowerCase().chars().sorted().toArray(),
                        s2.toLowerCase().chars().sorted().toArray()
                );

        System.out.println(isAnagram ? "ANAGRAM" : "NOT A ANAGRAM");
    }
}
//public class practicess {
//	
//	public boolean getanag(String s1,String s2) {
//		
//		boolean s=Arrays.equals(s1.chars().sorted().toArray(), 
//						s2.chars().sorted().toArray());
//		return s;
//			
//}
//
//public static void main(String...args) {
// practicess p=new practicess();
// 
// System.out.println(p.getanag("listen","silent"));
// 
//}
//}
//✨ Explanation
//1. s1.chars()
//
//Converts the string into a stream of ASCII values.
//
//2. .sorted()
//
//Sorts the characters in ascending order.
//
//Example: "listen" → [e, i, l, n, s, t]
//
//3. .toArray()
//
//Converts the sorted stream back to an int array.
//
//4. Arrays.equals(a, b)
//
//Checks if both sorted character arrays are identical.
