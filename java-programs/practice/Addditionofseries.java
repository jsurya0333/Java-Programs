package practice;

public class Addditionofseries {

	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
		int num=5;
		int sum=0;
		int prevsum=0;
		for(int i=1;i<=5;i++) {
			prevsum=prevsum+i;
			sum=sum+prevsum;
		}
		System.out.println(sum);

	}

}
