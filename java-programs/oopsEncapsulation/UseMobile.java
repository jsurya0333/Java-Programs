package oopsEncapsulation;

public class UseMobile {

	public static void main(String[] args) {
		battery b=new battery();
		b.capacity=5000;
		b.weight=50;
		
		Mobile m=new Mobile();
		m.brand="samsung";
		m.price=40000;
		m.color="black";
		m.bat=b;
		System.out.println("Brand="+m.brand+" "+"Price="+m.price+" "+"Color="+m.color+" "+"capacit="+m.bat.capacity+" "+"weight="+m.bat.weight);

		

	}

}
class Mobile {
	String brand;
	int price;
	String color;
	battery bat;
}
class battery{
int capacity;
int weight;
}
