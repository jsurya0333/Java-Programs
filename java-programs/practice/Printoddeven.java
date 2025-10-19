package practice;

public class Printoddeven {

	public static void main(String[] args) {
		int num=10;
		int evencount=0;
		int oddcount=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				evencount++;
			}
			else {
				System.out.print(i+" ");
				 oddcount++;
				}}
			System.out.println("oddcount="+oddcount++);
			System.out.println("evencount="+evencount++);
			}}


