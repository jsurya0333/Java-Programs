package Day4;

public class Commaseperator {

	public static void main(String[] args) {
		String[] str=args[0].split(","); 
		String first=str[0];
		String second=str[1];
		String last=str[str.length-1];
		String previous=str[str.length-2];
		System.out.println(first);
		System.out.println(second);
		System.out.println(last);
		System.out.println(previous);

	}

}
