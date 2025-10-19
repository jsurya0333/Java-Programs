package collections2;

import java.util.HashMap;
import java.util.Iterator;

public class MapMobile {
	
	public static void main(String[] args) {
		
			Mobile m1=new Mobile("samsung",40000,"black",4.5f,true);
			Mobile m2=new Mobile("oppo",20000,"white",5.4f,false);
			Mobile m3=new Mobile("redmi",30000,"greens",5.6f,true);
			Mobile m4=new Mobile("realme",25000,"blue",6.7f,false);				
			Mobile m5=new Mobile("iphone",100000,"red",6.5f,false);
			HashMap<Integer,Mobile> m=new HashMap<>();
			m.put(1, m1);
			m.put(2, m2);
			m.put(3, m3);
			m.put(4, m4);
			m.put(5, m5);
			//last character of the each brand
			m.forEach((x,y)->{System.out.println(y.getBrand().charAt(y.getBrand().length()-1));});
			
			// maximum price using keySet()
		Mobile max=m.get(1);
		for(Integer x:m.keySet()) {
			if(m.get(x).getPrice()>max.getPrice()) {
				max=m.get(x);
			}
		}
			System.out.println("maxPrice:"+max);
			
			//minimum price using values()
			Mobile max1=m.get(1);
		for(Mobile x:m.values()) {
			if(x.getPrice()>max1.getPrice()) {
				max1=x;
			}
		}
			System.out.println(max1);
			
			
			
			//maximum brand length using values
			Mobile max2=m.get(1);
			for(Mobile x:m.values()) {
				if(x.getBrand().length()>max2.getBrand().length()) {
					max1=x;
				}
			}
			System.out.println("maxbrandlength="+max2);
			
			//maximum brand length using keySet()
			Mobile max3=m.get(1);
			for(Integer x:m.keySet()) {
				if(m.get(x).getBrand().length()>max3.getBrand().length()) {
					max3=m.get(x);
				}
			}
			System.out.println("maxbrandlength= "+max3);
			
			//ITERATOR>>>>
			//remove using values in iterator
			Iterator<Mobile> x=m.values().iterator();
			while(x.hasNext()) {
				if(x.next().getWarranty()==true) {
					x.remove();
			}
		}
//			System.out.println(m);
			
			// remove using keySet in iterator
			Iterator<Integer> y=m.keySet().iterator();
			while(y.hasNext()) {
			if(m.get(y.next()).getWarranty()==true) {
					y.remove();
				}
			}
			System.out.println("iterator="+ m);
			
			//remove price using values in iterator
			Iterator<Mobile> z=m.values().iterator();
			while(z.hasNext()) {
			if(z.next().getPrice()>10000) {
					z.remove();
				}
			}
			System.out.println(m);
			
			//remove price using values in iterator
			Iterator<Integer> q=m.keySet().iterator();
			while(q.hasNext()) {
				if(m.get(q.next()).getPrice()<20000) {
					q.remove();
				}
			}
			System.out.println(m);
			
			// find maximum color length using keySet() iterator
			Iterator<Integer> t=m.keySet().iterator();
			Mobile maxi=m.get(1);
			while(t.hasNext()) {
				Integer key=t.next();
				if(m.get(key).getBrand().length()>maxi.getBrand().length()) {
					maxi=m.get(key);
				}
			}
			System.out.println("obj= "+maxi);
			
			//find maximum brand length using values() iterator
			Iterator<Mobile> f=m.values().iterator();
			Mobile maxii=m.get(1);
			while(f.hasNext()) {
				if(f.next().getBrand().length()>maxii.getBrand().length()) {
					maxii=f.next();
				}
			}
			System.out.println(maxii);
			}
	}

	class Mobile{
		
		private String brand;
		private int price;
		private String color;
		private float width;
		private boolean isWarranty;
		
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
		public void setWarranty(boolean isWarranty) {
			this.isWarranty=isWarranty;
		}
		public boolean getWarranty() {
			return isWarranty;
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
			public Mobile(String brand, int price, String color, float width,boolean isWarranty) {
			super();
			this.brand = brand;
			this.price = price;
			this.color = color;
			this.width = width;
			this.isWarranty=isWarranty;
		}
			@Override
			public String toString() {
				return "Mobile [brand=" + brand + ", price=" + price + ", color=" + color + ", width=" + width
						+ ", isWarranty=" + isWarranty + "]";
			}
			
		}
	


