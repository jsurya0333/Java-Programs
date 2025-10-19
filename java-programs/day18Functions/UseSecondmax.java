package day18Functions;

 public class UseSecondmax  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseSecondmaxx m=new UseSecondmaxx();
		int[] b= {12,45,46,67};
		System.out.println(m.getMax(b));
	}
}
class UseSecondmaxx {
	
	public int getMax(int[] a) {
		int max=a[0];
		int sec=a[0];
		int third=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				third=sec;
				sec=max;
				max=a[i];
			}
			else if(a[i]>sec && a[i]<max) {
				sec=a[i];
			}
			else if(a[i]>third&&a[i]<sec) {
				third=a[i];
			}
		}
		return third;
	}

}