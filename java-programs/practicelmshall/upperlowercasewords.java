package practicelmshall;

public class upperlowercasewords {

	public static void main(String[] args) {
		String words="ONE,soft,JAVA,course";
		String[] str=words.split(",");
		
		for(int i=0;i<str.length;i++) {
			
			if(str[i].equals(str[i].toUpperCase())) {
				System.out.println(str[i]);
			}
			
		}

	}

}
