package dataabstraction;

interface x {
	public String getBrand(String brand);
	public int getPrice(int price);
	}
interface y{
	public float getTipWidth(float tipwidth);
}
abstract class z{
	public String getModel(String model) {
		return model;
	}
	public abstract int noOfPen(int noofpen);
}
class Penss extends z implements x,y{
	public String getBrand(String brand) {
		return brand;
	}
	public int getPrice(int price) {
		return price;
	}
	public float getTipWidth(float tipwidth) {
		return tipwidth;
	}
	public int noOfPen(int noofpen) {
		return noofpen;
	}
}
	
	

	


