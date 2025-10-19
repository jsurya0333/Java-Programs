package practice;

public class Stringpalindrome {

	public static void main(String[] args) {
		String word="malayalam";
		String str="";
		for(int i=word.length()-1;i>=0;i--) {
			str=str+word.charAt(i);
		}
		if(str.equals(word)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
