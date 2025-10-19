package Extracoding;
import java.util.*;

import java.util.stream.Collectors;

public class GroupWordsTamil {
    public static void main(String[] args) {
        HashMap<Character, List<String>> map = new HashMap<>();
        List<String> words = Arrays.asList("apple", "ant", "banana", "bat", "ball", "cat", "car");

        for (String word : words) {
            char firstLetter = word.charAt(0);  
            //if already 'a' has came it does not create list if it is a new key only it will create list
            map.putIfAbsent(firstLetter, new ArrayList<>()); 
            map.get(firstLetter).add(word); 
        }
        map.forEach((x,y)->System.out.println(x+"="+y));
        
        
		Map<Character, List<String>> g =words.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
		g.forEach((x,y)->System.out.println(x+"="+y));
		
        
    for (String word :Arrays.asList("apple", "ant", "banana", "bat", "ball", "cat", "car","aaaaaa")) {
        char first = word.charAt(0);
        map.computeIfAbsent(first, k -> new ArrayList<>()).add(word);
    }
    System.out.println(map);
    
    map.forEach((x, y) -> { String longestInGroup = y.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    System.out.println(x + " = " + longestInGroup);});  //longest in each group

    String longest = map.values().stream().flatMap(List::stream).max(Comparator.comparingInt(String::length)).orElse(null);
    System.out.println(longest); //banana
    
    int maxLen = map.values().stream().flatMap(List::stream).mapToInt(String::length).max().orElse(0);
    System.out.println(maxLen); //6
    
    List<String> longestWords = map.values().stream().flatMap(List::stream).filter(s -> s.length() == maxLen).collect(Collectors.toList());
    System.out.println(longestWords); //give length similar to 6
    
    //flatMap convert list of string to one stream
    
    Map<Character, String> map1 = new HashMap<>();

    map1.putIfAbsent('a', "apple");   
    map1.putIfAbsent('a', "ant");     

    System.out.println(map1);

    }
}
