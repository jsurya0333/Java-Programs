package preparation;

public class Additionofseries {
	public static void main(String[] args) {
		
	//(0+1)+(1+2)+(1+2+3)+(1+2+3+4)=20
	
		int num=4;
		int sum=0;
		int previoussum=0;
		for(int i=1;i<=num;i++) {
		previoussum=previoussum+i;
		sum=sum+previoussum;
		}
		System.out.println(sum);
	}}
