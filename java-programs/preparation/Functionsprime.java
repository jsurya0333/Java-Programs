package preparation;

public class Functionsprime {

	public static void main(String[] args) {
		Prime p=new Prime();
		p.getPrime(2, 5);
	}
}
 class Prime {
	 public void getPrime(int a,int b) {
		 for(int i=a;i<=b;i++) {
			 int count=0;
			 for(int j=2;j<i;j++) {
				 if(i%j==0) {
					 count++;
					 break;
				 }
			 }
				 if(count==0) {
					 System.out.println(i);
				 }
			 }
		 }
	 }
 