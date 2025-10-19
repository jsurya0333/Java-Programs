package inheritanceandpolymorphism;

public class UseFruit {

	public static void main(String[] args) {
		banana b=new banana();
		b.name="apple";
		b.price=150;
		b.type="sevvazha";
		b.noofboxes=50;
		orange o=new orange();
		o.istasty=true;
		o.nooforanges=70;
		System.out.println("Name:"+b.name+" "+"Price:"+b.price+" "+"Type:"+b.type+" "+"NOOFBOXES:"+b.noofboxes+" "+"Tasty:"+o.istasty+"NOOFORANGES:"+o.nooforanges);
}}
class Fruit{
	String name;
	int price;
}
class banana extends Fruit{
	String type;
	int noofboxes;
	}
class orange extends Fruit{
	boolean istasty;
	int nooforanges;
}