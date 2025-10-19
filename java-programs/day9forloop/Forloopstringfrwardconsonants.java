package day9forloop;

public class Forloopstringfrwardconsonants {

	public static void main(String[] args) {
		String word="programs";
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)!='a'&&word.charAt(i)!='e'&& word.charAt(i)!='i'&& word.charAt(i)!='o'&& word.charAt(i)!='u')
			{
				System.out.println(count);
				count++;
			}

	}}}


