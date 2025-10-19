package collections1;

import java.util.ArrayList;

public class ArrayListmobile {

	public static void main(String[] args) {
		Mobile m1=new Mobile("samsung",40000,"black",4.5f);
		Mobile m2=new Mobile("oppo",20000,"white",5.4f);
		Mobile m3=new Mobile("redmi",30000,"greens",5.6f);
		Mobile m4=new Mobile("realme",25000,"blue",6.7f);				
		Mobile m5=new Mobile("iphone",100000,"red",6.5f);
		
		ArrayList<Mobile> m=new ArrayList<>();
		ArrayList<Character> c=new ArrayList<>();
		
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
		
		
//		for(Mobile d:m) {
//			c.add(d.getBrand().charAt(d.getBrand().length()-2));
//			
//		}
//			System.out.println(c);
		
		
		for(Mobile x:m) {
			Character ch1=x.getBrand().charAt(x.getBrand().length()-1);
			System.out.println(ch1);
			}
		
			Mobile max=m.get(0);
			for(Mobile y:m) {
				if(y.getPrice()>max.getPrice()) {
					max=y;
				}
			}
			System.out.println(max);
			
			Mobile maxlength=m.get(0);
			for(Mobile z:m) {
			if(z.getColor().length()>maxlength.getColor().length()) {
				maxlength=z;
			}
		}
		System.out.println(maxlength);
		
	}
}
class Mobile{
	private String brand;
	private int price;
	private String color;
	private float width;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
		public Mobile(String brand, int price, String color, float width) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.width = width;
	}
		public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", Color=" + color + ", width=" + width + "]";
	}
}