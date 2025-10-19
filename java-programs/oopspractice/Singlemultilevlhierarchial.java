package oopspractice;

public class Singlemultilevlhierarchial {

	public static void main(String[] args) {
		Apple a=new Apple("orange",700,100);
		System.out.println(a);
//multilevel		//Kiwi k=new Kiwi("banana",300,30,true);
				//System.out.println(k);
				//banana b=new banana("fig",200,true);
//hierarchial	//System.out.println(b);
		}
	}
class Fruit{
	String name;
	int price;
public Fruit(String name,int price) {
	this.name=name;
	this.price=price;
}
public String toString() {
	return name+" "+price;
}
}
class Apple extends Fruit{
	int noofboxes;

public Apple(String name,int price,int noofboxes) {
	super(name,price);
	this.noofboxes=noofboxes;
}
public String toString() {
	return super.toString()+" "+noofboxes;
}
}
//multilevel inheritance	
//class Kiwi extends Apple{
//	boolean isTasty;
//public Kiwi(String name,int price,int noofboxes,boolean isTasty) {
//		super(name,price,noofboxes);
//		this.isTasty=isTasty;
	//}
	//public String toString() {
		//return super.toString()+" "+isTasty;	
		//}
//hierarchial
//class banana extends Fruit{
	//boolean isTasty;
//public banana(String name,int price,boolean isTasty) {
		//super(name,price);
		//this.isTasty=isTasty;
	//}
	//public String toString() {
		//return super.toString()+" "+isTasty;	
		//}
//}
	
	



