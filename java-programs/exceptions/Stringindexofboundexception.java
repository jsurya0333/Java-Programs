package exceptions;

public class Stringindexofboundexception {

	public static void main(String[] args) {
		
		String a="Apple";
		try {
			System.out.println(a.charAt(5));
		}
		catch(StringIndexOutOfBoundsException m) 
			{
			System.out.println(m.getMessage());
			m.printStackTrace();
		}
		finally 
			{
			System.out.println("exception is handled");
		}
	}
}

