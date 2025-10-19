package collections3;

import java.util.*;
import java.util.stream.*;

public class InttoInteger {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8};
        
        // Convert to IntStream and find max
        int max = Arrays.stream(a)   // creates IntStream
                        .max()       // terminal operation
                        .getAsInt(); // because max() returns OptionalInt

        System.out.println("Maximum = " + max);
    }
}



