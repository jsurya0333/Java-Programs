package day14;

public class ArmstrongNumbers {

	public static void main(String[] args) {

	int num=153;
	int original=num;
	int temp=num;
	int count=0;
	while(num>0) {
		int rem=num%10;
		count++;
		num=num/10;
	}
	int reverse=0;
	while(temp!=0) {
		int rem=temp%10;
		int power=1;
	
		for(int i=0;i<count;i++) {
			power=power*rem;
		}
		reverse=power+reverse;
		temp=temp/10;
	}
	if(original==reverse)
	{
		System.out.println("armstrong numbr");
	}
	else {
		System.out.println("not");
	}

}}
