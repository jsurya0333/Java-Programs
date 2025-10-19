package Day4;

public class typeconversionexample {

	public static void main(String[] args) {
		String[] str=args[0].split(",");
		String name=str[0];
		int age=Integer.parseInt(str[1]);
		long num=Long.parseLong(str[2]);
		boolean ismale=Boolean.parseBoolean(str[3]);
		float weight=Float.parseFloat(str[4]);
		char initial=str[5].charAt(0);
		System.out.println(name);
		System.out.println(age);
		System.out.println(num);
		System.out.println(ismale);
		System.out.println(weight);
		System.out.println(initial);
		System.out.println(name+" "+age+" "+num+" "+ismale+" "+weight+" "+initial);
		
		
		

	}

}
