package exceptions;

public class UseName {

	public static void main(String[] args) throws UserNameException {
			
		//String n="Onesoft";
		//String p="Onesoft@1200";
		
		String u="Onesoft";
		String p="Onesoft@1200";
		try {
			if(u.length()>=7 && p.length()>10 && p.contains("@")) {
				System.out.println("login successful");	
		} else {
				throw new UserNameException ("login not successful");
			}
		} 
		catch(UserNameException a) {
				System.out.println(a.getMessage());
			}
		}
	}
class UserNameException extends Exception {
		public UserNameException(String msg) {
			super(msg);
		}
	}

	


