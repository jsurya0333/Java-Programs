package practicelmshall;

public class Longestword {

	public static void main(String[] args) {
		String words = "Java programming is powerful and interesting";
			String[] str=words.split(" ");
			String longest=str[0];
			for(int i=0;i<str.length;i++) {
				if(str[i].length()>longest.length()) {
				longest=str[i];
			}}
			System.out.println(longest);
	}

}
