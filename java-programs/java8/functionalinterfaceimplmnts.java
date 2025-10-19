package java8;


@FunctionalInterface
interface Students{
	public String getAdd(String a,String b);
}
interface Teacher {
	public String getUpper(String c);
		
	}
class Employeee implements Students,Teacher{
	public String getAdd(String a,String b) {
		return(a.concat(b));
	}
	public String getUpper(String c) {
		return(c.toUpperCase());
	}
}
public class functionalinterfaceimplmnts {
	
		public static void main(String[] args) {
			Employeee e=new Employeee();
			System.out.println(e.getAdd("Hello","world"));
			System.out.println(e.getUpper("Hello"));
		}
	}
