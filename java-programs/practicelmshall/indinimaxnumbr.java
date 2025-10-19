package practicelmshall;

public class indinimaxnumbr {

	public static void main(String[] args) {
		int[] num=new int[6];
		num[0]=12;
		num[1]=123;
		num[2]=122;
		num[3]=126;
		num[4]=1233;
		num[5]=1224;
		int max=num[0];
		for (int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}}
			System.out.println(max);
	}}
