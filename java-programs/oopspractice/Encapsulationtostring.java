package oopspractice;

public class Encapsulationtostring {

	public static void main(String[] args) {
		shirt s=new shirt("otto",2000,20);
		System.out.println(s);

	}

}
 class shirt{
	private String brand;
	private int price;
	private int size;

 public shirt(String brand,int price,int size) {
	 this.brand=brand;
	 this.price=price;
	 this.size=size;
 }
 public String toString() {
	 return "Brand="+brand+" "+"Price="+price+" "+"Size="+size;
	 
 }
	 
 }