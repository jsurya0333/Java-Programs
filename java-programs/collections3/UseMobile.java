package collections3;
import java.util.*;
import java.util.stream.Collectors;

	public class UseMobile {
		public static void main(String []args) {
			
			Mobile m1= new Mobile("Oppo",28000, 5, true);
			Mobile m2= new Mobile("Vivo",15000, 6, false);
			Mobile m3= new Mobile("Samsung",14000, 5, false);
			Mobile m4= new Mobile("Apple", 93000, 6, true);
			Mobile m5= new Mobile("Redmi", 20000, 5, false);
			
			ArrayList<Mobile> mob = new ArrayList<>();
			mob.add(m1);
			mob.add(m2);
			mob.add(m3);
			mob.add(m4);
			mob.add(m5);
			
			List<Mobile>a=mob.stream().filter(x->x.getPrice()>20000).collect(Collectors.toList());
			System.out.println(a);
			
			List<String>b=mob.stream().map(x->x.getBrand()).collect(Collectors.toList());
			System.out.println(b);
			
			Long c=mob.stream().filter(x->x.getPrice()>20000).count();
			System.out.println(c);
			
			Integer d=mob.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
			System.out.println(d);
			
			Mobile e =mob.stream().max(Comparator.comparing(Mobile::getPrice)).get();
			System.out.println(e);
			
			List<String>f=mob.stream().map(x->x.getBrand()).distinct().sorted().skip(1).limit(3).collect(Collectors.toList());
			System.out.println(f);
			
			Boolean g=mob.stream().anyMatch(x->x.getBrand().startsWith("S"));
			System.out.println(g);
		
			// Find second max price
			
			Integer h=mob.stream().map(x->x.getPrice()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
			System.out.println(h); 
			
			// If warranty is true , then discount to price and print netprice .
			
			List<Mobile> i=mob.stream().filter(x->x.isWarranty()==true).map(x->{
				x.setPrice(x.getPrice()-x.getPrice()*5/100);
				return x;
			}).collect(Collectors.toList());
			
			System.out.println(i);


			// Join two ListArray
			
			List<Integer> m = Arrays.asList(12,13,14,15);
			List<Integer> n = Arrays.asList(18,17,14,15);
			
			// Combine both into a list of lists 
			
			List<List<Integer>> o = Arrays.asList(m,n);
			System.out.println(o);
		
			// Flatten the list of lists -> collect into list
			
			List<Integer> p = o.stream().flatMap(x->x.stream()).collect(Collectors.toList());
			System.out.println(p);
			}
	}

	class Mobile {
		private String brand;
		private int price;
		private int size;
		private boolean isWarranty;
		
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public boolean isWarranty() {
			return isWarranty;
		}
		public void setWarranty(boolean isWarranty) {
			this.isWarranty = isWarranty;
		}
		public Mobile(String brand, int price, int size, boolean isWarranty) {
			super();
			this.brand = brand;
			this.price = price;
			this.size = size;
			this.isWarranty = isWarranty;
		}
		@Override
		public String toString() {
			return "Mobile [brand=" + brand + ", price=" + price + ", size=" + size + ", isWarranty=" + isWarranty + "]";
		}


}
