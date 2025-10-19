package exceptions;

public class UseAgeException {

	public static void main(String[] args) throws AgeException{
		int age=12;
		try {
			if(age>=18) {
				System.out.println("eligible for vote");	
			} else {
				throw new AgeException("not eligible");
			}
		} catch(AgeException a) {
			System.out.println(a.getMessage());
		}
	}
}


class AgeException extends Exception {
	public AgeException(String msg) {
		super(msg); //return the message from the parent constructor
	}
}