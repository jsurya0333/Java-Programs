package exceptions;

public class Numberformatexception {

	public static void main(String[] args) {
		String a="2323red";
		try {
			int c=Integer.parseInt(a);
			System.out.println(c);
		}
		catch(NumberFormatException m) 
			{
			System.out.println(m.getMessage());
		}
		finally 
			{
			System.out.println("exception is handled");
		}
	}
}
