package practice;

public class Upperlowercount {

	public static void main(String[] args) {
		String word="ONesoFT";
		int lowercount=0;
		int uppercount=0;
		String word1=word.toLowerCase();
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==word1.charAt(i)){
				lowercount++;
			}
			else{
				uppercount++;
			}}
		
		System.out.println("lowercasecount="+lowercount);
		System.out.println("uppercasecount="+uppercount);


		}}
