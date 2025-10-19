package ooppractice;

public class multilvlhierchial {

	public static void main(String[] args) {
		Carss c=new Carss();
		System.out.println(c.getBrand());
		

	}

}
interface Car{
	public String getBrand();
}
interface Engine extends Car{
	public int getPrice();
	}
interface battery extends Engine{
	public String getModel();
}
interface Tyre extends Car{
	public int getTyres();
}
 class Carss implements battery,Tyre{
	 
	public String getBrand() {
		return "nexa";
	}
	public int getPrice() {
		return 450000;
	}
	public String getModel() {
		return "voltas";
	}
	public int getTyres() {
		return 4;
	}
}