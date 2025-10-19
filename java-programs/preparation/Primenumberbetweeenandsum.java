package preparation;

public class Primenumberbetweeenandsum {

	public static void main(String[] args) {
			int num=10;
			int sum=0;
			for(int i=1;i<=num;i++) {
				int count=0;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						count++;
					}}
					if(count==0) {
						System.out.println(i);
						sum=sum+i;
					}}
					
				System.out.print(sum);
					}}
