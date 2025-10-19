package day3stringarray;

public class Tochararray {

	public static void main(String[] args) {
		String name="varun";
		char[] ch=name.toCharArray();
		char start=ch[0];
		char last=ch[ch.length-1];
		System.out.println(last);
		System.out.println(start);

	}

}
