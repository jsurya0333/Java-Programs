package preparation;

public class PrimenumbrorNot {
	public int getPrime(int a) {
		int num=a;
		boolean isprime=true;
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				isprime=false;
				break;
			}}
			if(isprime==true) {
				return 0;
				}
			else {
				return 1;
			}}

public static void main(String[] args) {
	PrimenumbrorNot p=new PrimenumbrorNot();
	System.out.println(p.getPrime(7));
}
	
}

