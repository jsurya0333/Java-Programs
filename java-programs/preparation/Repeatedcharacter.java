package preparation;

public class Repeatedcharacter {

	public static void main(String[] args) {
		String word="banana";
		char[] ch=word.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='#';
				}
			}
		if(count>0 && ch[i]!='#') {
				System.out.println(ch[i]);
			}
		}

	}

}
