package preparation;

public class Wordpalindrome {

	public static void main(String[] args) {
		String word="malayalam";
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		if(word.equals(rev)) {
			System.out.println("palindrome");
		}
			else {
				System.out.println("not palindrome");
			}
		}
	}
