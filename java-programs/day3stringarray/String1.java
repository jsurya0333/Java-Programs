package day3stringarray;

public class String1 {

	public static void main(String[] args) {
		String name="varun";
		String upper=name.toUpperCase();
		System.out.println(upper);
		String lower=name.toLowerCase();
		System.out.println(lower);
		int length=name.length();
		System.out.println(length);
		String name1="Ajay";
		String merge=name1.concat(name);
		System.out.println(merge);
		boolean eql=name.equals(name1);
		System.out.println(eql);
		boolean eql1=name.equals("VARUN");
		System.out.println(eql1);
		boolean eqlignore=name.equalsIgnoreCase("VARUN");
		System.out.println(eqlignore);
		boolean check=name.contains("a");
		System.out.println(check);
		boolean check1=name.contains("ar");
		System.out.println(check1);
		boolean check2=name.contains("au");
		System.out.println(check2);
		boolean start=name.startsWith("v");
		System.out.println(start);
		boolean end=name.endsWith("n");
		System.out.println(end);
		boolean start1=name.startsWith("ar");
		System.out.println(start1);
		int indx=name.indexOf('n');
		System.out.println(indx);
		char ch=name.charAt(2);
		System.out.println(ch);
		String substr=name.substring(2,5);
		System.out.println(substr);
		String substr1=name.substring(1);
		System.out.println(substr1);
				
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	}

}
