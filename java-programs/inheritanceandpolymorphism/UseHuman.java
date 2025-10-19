package inheritanceandpolymorphism;

public class UseHuman {

	public static void main(String[] args) {
		Teecher t=new Teecher();
		t.name="surya";
		t.height=5;
		t.role="developer";
		t.salary=30000;
		System.out.println("name:"+t.name+" "+"height:"+t.height);
	}

}
class Hooman{
	String name;
	int height;
}
class Teecher extends Hooman{
	String role;
	int salary;
	
}
