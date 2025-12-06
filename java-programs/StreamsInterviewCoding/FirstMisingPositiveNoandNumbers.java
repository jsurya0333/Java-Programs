package StreamsInterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FirstMisingPositiveNoandNumbers {

	public static void main(String[] args) {
		
		int[] arr = {-7,1,7,3,6,4,10};//list= max(Integer::CompareTo)
		
        int min=Arrays.stream(arr).min().orElse(1); //min no in the array
        int max=Arrays.stream(arr).max().orElse(min);//max no in the array
        
       Integer firstMissing=IntStream .rangeClosed(min, max)// b/w the min nd max
        								 .filter(x->Arrays.stream(arr)//x->all no b/w min and max
        								 .noneMatch(y->y==x)).findFirst().orElse(0);//y->no in the int array
        System.out.println(firstMissing);
        
        //all missing number b/w them
        List<Integer> missingNumbers =
                IntStream.rangeClosed(min, max)
                         .filter(x -> Arrays.stream(arr).noneMatch(y -> x == y))
                         .boxed()
                         .toList();

        System.out.println(missingNumbers);
	}
}
//Find minimum element in the array
//int min = Arrays.stream(arr).min().orElse(1);
//
//
//Converts array → stream
//
//.min() → finds the smallest number
//
//If array is empty → return 1 (because of orElse)
//
//For the array:
//{3,5,7,1,2,8,4}
//👉 min = 1
//
//2️⃣ Find maximum element
//int max = Arrays.stream(arr).max().orElse(min);
//
//
//.max() → finds largest number
//
//If array is empty → return min
//
//👉 max = 8
//
//3️⃣ Find numbers between min and max
//IntStream.range(min, max)
//
//
//This generates a stream of numbers:
//
//range(1, 8) → 1,2,3,4,5,6,7
//
//(Note: 8 is excluded)
//
//4️⃣ Check which number is missing
//.filter(x -> Arrays.stream(arr).noneMatch(y -> y == x))
//
//
//For every number x (1 to 7):
//
//Check if x does NOT exist in the array
//
//noneMatch returns true when element is missing
//
//Let's see:
//
//x	Exists in array?	Missing?
//1	Yes	No
//2	Yes	No
//3	Yes	No
//4	Yes	No
//5	Yes	No
//6	No	YES → Missing
//7	Yes	No
//
//👉 First missing number = 6
//
//5️⃣ Pick first missing
//.findFirst()
//
//
//→ returns first missing value → 6
//
//If no missing → return 0
//(because of .orElse(0))
//
//✅ FINAL OUTPUT
//6
