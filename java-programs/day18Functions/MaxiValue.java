package day18Functions;

public class MaxiValue {

	public static void main(String[] args) {
		int[] a= {5,67,78,4,789};
		int max=a[0];
		 for(int i=0;i<a.length;i++) {
			 if(max<a[i])
			 {
				 max=a[i];
			 }
		 }
		 System.out.println(max);
	 }

	}


