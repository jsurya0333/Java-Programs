package ooppractice;

public class Alltypeinheritance {

	public static void main(String[] args) {
		BikeDetails b=new BikeDetails();
		System.out.println("Brand:"+b.getBrand("ninja")+" "+"Price:"+b.getPrice(567000)
		+" "+"Tyre:"+b.getTyres(4)+" "+"Width:"+b.getWidth(45.7f)+" "+"Weight:"+b.getWeight(500));
	}
}
interface Bike{
	public String getBrand(String brand);
}
interface SportBike extends Bike{
	public int getPrice(int price);
	}
interface MyBike extends SportBike{
	public float getWidth(float width);
}
interface Bikes extends Bike{
	public int getTyres(int tyres);
}
abstract class OwnBike{
	public abstract int getWeight(int weight);
}
class BikeDetails extends OwnBike implements Bikes,MyBike,SportBike{
	public String getBrand(String brand) {
		return brand;
	}
	public int getPrice(int price) {
		return price;
	}
	public float getWidth(float width) {
		return width;
	}
	public int getTyres(int tyres) {
		return tyres;
	}
	public int getWeight(int weight) {
		return weight;
	}
}