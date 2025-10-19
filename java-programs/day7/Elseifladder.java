package day7;

public class Elseifladder {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		if ((a>b)&&(a>b)&&(a>c)){
			System.out.println(a);
			
		}
		else if ((b>a)&&(b<c)&&(d>a)) {
			System.out.println(d);
		}
		else if ((d>a)&&(c>d)&&(a>c)) {
			System.out.println(c);	
		}
		
			

	}

}
