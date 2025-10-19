package collections1;
import java.util.ArrayList;
public class Calculation {

	  public static void main(String[] args) {
	   ArrayList<Integer> nums = new ArrayList<>();

       // add elements
       nums.add(10);                 // adds at the end → [10]
       nums.add(20);                 // [10, 20]
       nums.add(30);                 // [10, 20, 30]
       nums.add(1, 15);              // adds at index 1 → [10, 15, 20, 30]
       	System.out.println(nums);
       // get element
       int value = nums.get(2);      // index 2 → 20
       	System.out.println(nums);
       // set element (replace)
      int value1= nums.set(2, 25);              // replaces element at index 2 → [10, 15, 25, 30]
       	System.out.println(nums);
       // remove element
       nums.remove(1);               // removes element at index 1 (15) → [10, 25, 30]
       nums.remove(Integer.valueOf(30)); // removes object 30 → [10, 25]
       	System.out.println(nums);
       // size of ArrayList
       int size = nums.size();       // 2 elements
       	System.out.println(nums);
       // contains element
       boolean has25 = nums.contains(25); // true
       	System.out.println(nums);
       // isEmpty
       boolean empty = nums.isEmpty(); // false
       	System.out.println(nums);
       // clear all elements
       nums.clear();  // []
       System.out.println(nums);
	}

}
