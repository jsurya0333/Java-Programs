package practice;

public class Stringbreakcontinue {

	public static void main(String[] args) {
		String name="program";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='g') {
				continue;
			}
			System.out.println(name.charAt(i));

		}

	}

}
