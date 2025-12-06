package StreamsInterviewCoding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringJoining {
public static void main(String[] args) {
		
        String[] wordss={" Welcome", " to ", ""," ", "the world","  ","gyss! ", " "};
        
		String add=Arrays.stream(wordss)
				   .map(x->x.trim())		//trim empty spaces
				   .filter(y->!y.isEmpty()) //if empty string will remove
				   .collect(Collectors.joining(" ")); // join all the words
		
		System.out.println(add);
		
		////////////////////////////////////////
		
		String add1=String.join(" ", wordss)
				          .trim().replaceAll("\s+", " ");
		
		System.out.println(add1);

	}

}
