package practice;

public class primeornot {

	public static void main(String[] args) {
		int num=11;
		boolean isprime=true;
		for(int i=1;i<num;i++) {
			if(num%2==0)
			isprime=false;
		}
		if(isprime==true) {
		System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}

	}

}
