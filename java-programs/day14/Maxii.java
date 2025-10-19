package day14;

public class Maxii {

	public static void main(String[] args) {
		String[] str= {"banana","apple","east"};
		String longs=str[0];
		for(int i=0;i<str.length;i++) {
			if(longs.length()<str.length) {
				longs=str[i];
				}
		}
		System.out.println(longs);

	}

}
