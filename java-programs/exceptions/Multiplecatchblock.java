package exceptions;

public class Multiplecatchblock {

	public static void main(String[] args) {
		String[] a= {"apple","banana","orange",null};
		try {
			char ch=a[5].charAt(0);
			System.out.println(ch);
		}
		catch(ArrayIndexOutOfBoundsException m) {
			System.out.println(m.getMessage());
		}
		catch(StringIndexOutOfBoundsException k) {
			System.out.println(k.getMessage());
		}
		catch(NullPointerException v) {
			System.out.println(v.getMessage());
		}
		finally {
			System.out.println("exception is handled");
		}
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

}
