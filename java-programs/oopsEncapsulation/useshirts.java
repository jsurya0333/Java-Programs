package oopsEncapsulation;

public class useshirts {

	public static void main(String[] args) {
		shirts s=new shirts("otto",500,"red");
		System.out.println("brand="+s.brand+" "+"price="+s.price+" "+"color="+s.color);
	}}
class shirts {
	String brand;
	int price;
	String color;

public shirts(String brand,int price,String color) {
	this.brand=brand;
	this.price=price;
	this.color=color;
}
	
}
