package inheritanceandpolymorphism;

public class UseBike {

	public static void main(String[] args) {
		Petrol p= new Petrol();
		p.getbrand();
		p.getprice();
		p.getPetrol();
		
}}
class bike{
	
	public void getbrand() {
		System.out.println("brand:"+ "ktm");
	}
public void getprice() {
		System.out.println("Price:"+5000);
}
}
class Petrol extends bike{
	public void getPetrol() {
		System.out.println("brand:"+"HP");
	}
}
	

