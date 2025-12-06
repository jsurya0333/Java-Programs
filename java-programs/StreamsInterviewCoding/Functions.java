package StreamsInterviewCoding;

import java.util.Comparator;
import java.util.List;

public class Functions {
	
	public String getmax(List<String> a) {
		 
		String max=a.stream()
					.max(Comparator.comparing(String::length))
				    .orElse(null);
		return max;
	}
	public static void main(String...args) {
		
		Functions p=new Functions();
		
		List<String> s=List.of("hayyyryana","india","malaysia");
		
		System.out.println(p.getmax(s));
		
	}

}
