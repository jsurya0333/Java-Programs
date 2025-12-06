package StreamsInterviewCoding;
import java.util.*;
import java.util.stream.Collectors;

public class FirstDuplicateInString {

    public static void main(String[] args) {

        String str = "jjayasurya";
        
        Set<Character> alreadySeen = new LinkedHashSet<>();

        Character result =str.chars()						//use replace if its sentence
                	   			.mapToObj(c -> (char) c)           
                	   			.filter(x -> !alreadySeen.add(x)) //already added character will be filtered(duplicates)
                	   			//.skip(1)-->for 2nd duplicate
                	   			.findFirst()
                	   			.orElse(null);

        System.out.println("First duplicate in " + str + " => " +result);
    
//If you want first occurrence duplicates for each string in String[]:

        String[] arr = {"jggaya", "suuurya"};

        for (String strs : arr) {
        		Set<Character> seeen = new LinkedHashSet<>();

        		Character results =
        					strs.chars()
        						.mapToObj(c -> (char) c)
        						.filter(ch -> !seeen.add(ch))
        						.findFirst()
        						.orElse(null);

        System.out.println("First duplicate in " + strs + " => " + results);
		}
        //First duplicate in string list
        
        List<String> list = List.of("jayasurya","swampfire","diamondhead");
        
        Set<Character> alreadyySeen = new LinkedHashSet<>();

        Character ch = list.stream()
        						.flatMap(c->c.chars()
        						     .mapToObj(f-> (char) f))						
                	   			.filter(x -> !alreadyySeen.add(x)) 
                	   			.findFirst()
                	   			.orElse(null);
					System.out.println(ch);
    }
}