package StreamsInterviewCoding;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="madam";
		
		String clean = str.toLowerCase();
	    String reversed = new StringBuilder(clean).reverse().toString();

	    if(clean.equals(reversed)) {
	    	System.out.println("pali");
	    }
	    else {
	    	System.out.println("NotPali");

	    }

	}

}
