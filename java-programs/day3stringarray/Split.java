package day3stringarray;

public class Split {

	public static void main(String[] args) {
		String name="apple,banana,orange";
		String[] str=name.split(",");
		String str1=str[1];
		System.out.println(str1);
		String str2=str[str.length-1];
		System.out.println(str2);
		char ch=str2.charAt(str2.length()-1);
		System.out.println(ch);
		char str3=str[str.length-1].charAt(str[str.length-1].length()-1);
		System.out.println(str3);
		String str4=str[0];
		String upper=str4.toUpperCase();
		System.out.println(upper);
		String name1="arun,selvam,surya,";
		String[] strr=name1.split(",");
		String s1=strr[0];
		String s2=strr[1];
		String s3=strr[2];
		System.out.println(s1);
		String length1=strr[strr.length-2];
		System.out.println(length1);
		int length2=s2.length();
		System.out.println(length2);
		
		
				
				
		
		

	}

}
