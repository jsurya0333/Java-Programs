package day18Functions;
public class ArmstrongNumber {
	public int getArmstrong(int a) {
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
		return original;
		}
		else {
		return 0;
	}
}}
	