package preparation;

public class vowelsconsonants {

	public static void main(String[] args) {
			String name="onesoft";
			char[] ch=name.toCharArray();
			int consonantcount=0;
			for(int i=0;i<ch.length;i++) {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
					System.out.println(ch[i]);	
					consonantcount++;
			}
		}
			
				System.out.println("consonantcount="+consonantcount);
			}
	}
