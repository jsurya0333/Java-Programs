package day7;

public class Switchcasevowels {

	public static void main(String[] args) {
		String str="PROGRAM";
		String str1=str.toLowerCase();
		if(str1.contains("a")||str1.contains("e")||(str1.contains("i"))||(str1.contains("o")||(str1.contains("u")))) {
			System.out.println("this string has vowels");	
		}
		else {
			System.out.println("this string has no vowels");
		}
	}

}
