package PreInterviewCoding;

public class StringLiterals {

	public static void main(String[] args) {
		
		String a="Java";
		String b="Python";//stored in the string constant pool memory
		
		System.out.println(a.hashCode());
		
		a=a.concat("Language");
		System.out.println(a.hashCode());
		
		StringBuffer c=new StringBuffer("Python");//stored in the heap memory
		System.out.println(c.hashCode());
		
		c=c.append("languge");
		System.out.println(c.hashCode());
		

	}

}
