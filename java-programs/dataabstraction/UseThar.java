package dataabstraction;

public class UseThar {

	public static void main(String[] args) {
		Car t=new Thar();
		System.out.println(t.getBrand("nexa"));
		System.out.println(t.getPrice(27789000));
		System.out.println(t.getColor("blue"));

	}

}
 class Thar implements Car {
	public String getBrand(String brand) {
		return brand.toUpperCase();
	}
	public int getPrice(int price) {
		return price+price*5/100;
	}
	public String getColor(String color) {
		return color.toLowerCase();
	}
}