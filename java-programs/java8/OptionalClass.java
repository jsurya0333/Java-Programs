package java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		Optional<String> a=Optional.of("hi");
		System.out.println("of="+a);
		if(a.isPresent()) {
			System.out.println("present="+a);
		}
		
		Optional<String> b=Optional.of("hello world");
		System.out.println("b="+b);
		
		Optional<String> c=Optional.of("  ");
		if(c.isPresent()) {
			System.out.println("c="+c);
		}
		else {
			System.out.println("value is empty");
		}
		
		Optional<Integer> d = Optional.empty();
		System.out.println("empty="+d);
        System.out.println("d="+d.isPresent());
        
		Optional<String>e=Optional.ofNullable(null);
		System.out.println("ofnullable="+e);
		}
	}
