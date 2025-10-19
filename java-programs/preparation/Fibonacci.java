package preparation;

public class Fibonacci {

	public static void main(String[] args) {
			int num=10;
			int a=0;
			int b=1;
			for(int i=0;i<=num;i++) {
				int sum=a+b;
				System.out.println(a);
				a=b;
				b=sum;
			}
	}

}
