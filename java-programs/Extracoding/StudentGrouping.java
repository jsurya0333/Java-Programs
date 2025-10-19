package Extracoding;
import java.util.*;

public class StudentGrouping {
    public static void main(String[] args) {
        // HashMap: Key = Character, Value = List of Student Names
        HashMap<Character, List<String>> map = new HashMap<>();

        // மாணவர்களின் பெயர்கள்
        List<String> students = Arrays.asList("Arun", "Anitha", "Balaji", "Banu", "Chandru", "Charan", "Divya");

        // ஒவ்வொரு பெயரையும் loop செய்ய
        for (String name : students) {
            char firstLetter = name.charAt(0); // முதல் எழுத்து எடுத்துக்கொள்

            // அந்த எழுத்து இல்லாதா புதிய List உருவாக்கு
            map.putIfAbsent(firstLetter, new ArrayList<>());

            // அந்த பெயரை அந்த எழுத்துக்குரிய List-ல் சேர்
            map.get(firstLetter).add(name);
        }

        // முடிவை print செய்
        for (Map.Entry<Character, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
