package day9forloop;

public class forloopstringreverse {

	public static void main(String[] args) {
		String word="javaonesoft";
		for(int i=word.length()-1; i>=0;i--)
		{
			System.out.println(word.charAt(i));
		}
	}

}
