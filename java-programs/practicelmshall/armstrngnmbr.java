package practicelmshall;

public class armstrngnmbr {

	public static void main(String[] args) {
		int num=153;
		int og=num;
		int temp=num;
		int count=0;
		while(num!=0) {
			int r=num%10;
			count++;
			num=num/10;
		}
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power=power*rem;
			}
			sum=sum+power;
			temp=temp/10;
		}
	if(sum==og) {
		System.out.println("arm numbr");
	}
	else {
		System.out.println(" not arm numbr");
	}}}
