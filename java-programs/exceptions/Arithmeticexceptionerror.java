package exceptions;

public class Arithmeticexceptionerror {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
			}
		catch (ArithmeticException A) 
			{
			//System.out.println(a);
			System.out.println(A.getMessage());
			//A.printStackTrace();
			}
		finally 
			{
			System.out.println("exception is handled");
			}
		}
	}
