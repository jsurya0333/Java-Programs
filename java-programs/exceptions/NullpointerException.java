package exceptions;

public class NullpointerException {

	public static void main(String[] args) {
		String name=null;
		try {
			System.out.println(name.toUpperCase());
		}
		catch(NullPointerException N) 
			{
			System.out.println(N.getMessage());
		}
		finally {
			System.out.println("exception is handled");
		}
	}

}
