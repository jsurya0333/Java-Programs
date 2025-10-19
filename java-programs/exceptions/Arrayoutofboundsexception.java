package exceptions;

public class Arrayoutofboundsexception {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException m) 
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

