package inheritanceandpolymorphism;

public class Findmaxmethodoverloadingpoly {

	public static void main(String[] args) {
		
		findmax f=new findmax();
		System.out.println(f.max(5,8));
		System.out.println(f.max("suryaa","abinayaa"));
		int[] nums= {6,8,0,89,54};
		System.out.println(f.max(nums));
		}}
class findmax{
	public int max(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public String max(String a,String b) {
		if(a.length()>b.length()) {
			return a;
		}
		else {
			return b;
		}
	}
	public int max(int[] a) {
		int m=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>m) {
			m=a[i];
		}
	}
	return m;
	
	}}


