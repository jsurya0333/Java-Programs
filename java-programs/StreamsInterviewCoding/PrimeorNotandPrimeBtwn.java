package StreamsInterviewCoding;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeorNotandPrimeBtwn {
    
    public static void main(String[] args) {

    	//prime no or not
    	int num = 13;

    	boolean prime = IntStream.rangeClosed(2, (int)Math.sqrt(num))
    	                         .allMatch(x -> num % x != 0);

    	System.out.println(prime ? "It is a Prime Number" : "It is not a Prime Number");

		
	//prime no between
		int num1=20;
		Map<Boolean, List<Integer>> partition =
    	        IntStream.rangeClosed( 2, num1 )
    	                 .boxed()
    	                 .collect(Collectors.partitioningBy(
    	                        x -> IntStream.rangeClosed(2, (int) Math.sqrt(x))
    	                                      .allMatch(y -> x % y != 0)
    	                ));

    	System.out.println("Primes     : " + partition.get(true));
    	System.out.println("Non-Primes : " + partition.get(false));
    	
    	//prime no count
    	long primeCount = partition.get(true).size();
    	System.out.println(primeCount);
    	
    	//prime no sum
    	int primeSum = partition.get(true)
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

    	System.out.println(primeSum);
    	
//    	List<Integer> primes = partition.get(true);
//
//	    return primes.toString();

		
    }
}

//1️⃣ IntStream.range(2, num)
//This creates a stream of integers from 2 to num-1.
//
//For num = 17 → stream is:
//
//2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
//
//These are the numbers we test to see if 17 is divisible.
//
//2️⃣ Check prime using .allMatch(x -> num % x != 0)
//
//allMatch() returns true only if ALL elements satisfy the condition.



//Let’s check 11
//
//√11 ≈ 3
//Check divisors: 2,3
//
//11%2 ≠ 0 ✔
//11%3 ≠ 0 ✔
//
//🔹 BOTH true → prime
//
//Let’s check 12
//
//√12 ≈ 3
//Check: 2,3
//
//12%2 = 0 ❌
//Fails → Not prime → removed