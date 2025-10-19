package collections1;
import java.util.ArrayList; // Import the ArrayList class

public class MyClass {
    public static void main(String[] args) {
        // Now you can create and use an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("surya");
        names.removeFirst();
        names.addFirst("k");
        System.out.println(names);
    }
}