package day18Functions;

public class ThirdmaxForLoop {

	public static void main(String[] args) {
		int[] a= {24,56,78,90,65,88};
		int max=a[0];
		int sec=a[0];
		int third=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				third=sec;
				sec=max;
				max=a[i];
			}
			else if(a[i]>sec && a[i]<max) {
				third=sec;
				sec=a[i];
			}
			else if(a[i]>third&&a[i]<sec) {
				third=a[i];
			}}
			System.out.println(third);
		}

	}


