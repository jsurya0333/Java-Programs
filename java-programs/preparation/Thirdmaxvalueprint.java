package preparation;

public class Thirdmaxvalueprint {
	public int getThird(int[] a) {
		int max=a[0];
		int secmax=a[0];
		int thirdmax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				thirdmax=secmax;
				secmax=max;
				max=a[i];
			}
			if(a[i]>secmax&&a[i]<max) {
			thirdmax=secmax;	
			secmax=a[i];
			}
			if(a[i]>thirdmax&&a[i]<secmax) {
				thirdmax=a[i];
				}}
			return thirdmax;}
public static void main(String[] args) {
	int[] b= {12,14,680,89,90};
	Thirdmaxvalueprint p=new Thirdmaxvalueprint();
	System.out.println(p.getThird(b));
	}}