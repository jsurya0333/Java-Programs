package oopsEncapsulation;

public class Printer {
	private String brand;
	private String model;
	private String color;
	private int price;
	
	public Printer(String brand,String model,String color,int price) {
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
	}
		public void setbrand(String brand) {
			this.brand=brand;
		}
		public void setmodel(String model) {
			this.model=model;
		}
		public void setcolor(String color) {
			this.color=color;
		}
		public void setprice(int price) {
			this.price=price;
		}
		public String getbrand() {
			return brand;
		}
		public String getmodel() {
			return model;
		}
		public String getcolor() {
			return color;
		}
		public int getprice() {
			return price;
		}
		}
	
