package day18Functions;

public class Repeatedwords {

	public static void main(String[] args) {
		String str="java is fun java is fun and powerful";
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++) {
			int count=0;
			for(int j=i+1;j<str1.length;j++) {
				if(str1[i].equals(str1[j])) {
					count++;
					str1[j]="#";
				}}
			if(count>0&&str1[i]!="#") {
					System.out.println(str1[i]);
				}
			}
		
	}

}
