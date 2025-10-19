package day3stringarray;

public class usecar {

	public static void main(String[] args) {
		Car c=new Car();
		c.brand="bmw";
		c.model="xv1";
		c.price=20000000;
		c.ispetrol=false;
		System.out.println(c.brand+" "+c.model+" "+c.price+" "+c.ispetrol);
		String upper=c.brand.toUpperCase();
		System.out.println(upper);
		int length=c.brand.length();
		System.out.println(length);
		
		

	}

}
