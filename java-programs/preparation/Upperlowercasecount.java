package preparation;

public class Upperlowercasecount {
	public static void main(String[] args) {
		String str = "oneSOFT";
		String str1=str.toLowerCase();
		int lowcount = 0;
		int uppcount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i)==str1.charAt(i)) {
				lowcount++;
			} else {
				uppcount++;
			}
		}
		System.out.println("uppercase="+uppcount);
		System.out.println("lowercase="+lowcount);
		
	}
}
