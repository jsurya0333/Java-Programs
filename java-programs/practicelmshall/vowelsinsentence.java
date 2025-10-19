package practicelmshall;

public class vowelsinsentence {
	public static void main(String[] args) {
			String word="java,is,fun,java";
			String[] word1=word.split(",");
			for(int i=0;i<word1.length;i++) {
				char[] ch=word1[i].toCharArray();
				for(int j=0;j<ch.length;j++) {
				
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u') {
					System.out.println(ch[j]);
				}}}}}
