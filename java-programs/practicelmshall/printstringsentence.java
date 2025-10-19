package practicelmshall;

public class printstringsentence {

	public static void main(String[] args) {
		
		String words = "Java programming issss powerful andiiii interesting";
		String[] str=words.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i].charAt(i));
		}

	}
}
