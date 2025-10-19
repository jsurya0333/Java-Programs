package java8;
@FunctionalInterface
interface prime {
	public String getPrimess(int a);
	
	}
class primes {
	public String findPrimess(int c) {
		boolean isprime=true;
		for(int i=2;i<c;i++) {
			if(c%2==0) {
				isprime=false;
				break;
			}}
			if(isprime==true) {
				return "prime";
				}
			else {
				return "not prime";
			}}}

public class Methodreferenceprime {

	public static void main(String[] args) {
		primes p=new primes();
		prime num=p::findPrimess;
		int c=70;
		System.out.println(num.getPrimess(c));
	}
}
