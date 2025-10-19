package practice;

public class fibonacci {

	public static void main(String[] args) {
		int num=5;
		int a=0;
		int b=1;
		for(int i=0;i<=5;i++) {
			int sum=a+b;
			System.out.println(a);
			a=b;
			b=sum;
			
		}
		

	}

}
