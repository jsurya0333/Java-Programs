package Day4;

public class Typeconversionfloat {

	public static void main(String[] args) {
		float f1=Float.parseFloat(args[0]);
		float f2=Float.parseFloat(args[1]);
		float f3=Float.parseFloat(args[2]);
		float f4=Float.parseFloat(args[3]);
		float f5=Float.parseFloat(args[4]);
		float sum=f1+f2+f3+f4+f5;
		System.out.println(sum);
		float avg=sum/5;
		System.out.println(avg);
		System.out.println(avg+" "+sum);
		
		
		

	}

}
