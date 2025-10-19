package Day4;

public class Typeconversioninteger {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
		int sum=a+b+c+d+e;
		int avg=sum/5;
		System.out.println(sum+" "+avg);
		int last=Integer.parseInt(args[args.length-1]);
		System.out.println(last);
		
		

	}

}
