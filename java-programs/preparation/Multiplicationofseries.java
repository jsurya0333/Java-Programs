package preparation;

public class Multiplicationofseries {

	public static void main(String[] args) {
		int num=5;
		//(1*1*1)+(2*2*2)+(3*3*3)+(4*4*4)+(5*5*5)
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+(i*i*i);
		}
		System.out.println(sum);
	}

}
