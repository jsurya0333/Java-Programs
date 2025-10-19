package practicelmshall;

public class upperlowercountinsentence {
	public static void main(String[] args) {
		
		String word="One,sOft,jaVa,cOurse";
		String word1=word.toLowerCase();
		char[] ch=word.toCharArray();
		char[] ch1=word1.toCharArray();
		int lowercount=0;
		int uppercount=0;
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
			if(ch[i]==ch1[i]) {
				
				lowercount++;
			}
			else {
				uppercount++;
			}
		}}
		System.out.println("lower="+lowercount);
		System.out.println("upper="+uppercount);
		}}

//		