package collections3;

import java.util.*;
import java.util.stream.Collectors;
public class StreamsMobile {

	public static void main(String[] args) {
		Mobiles m1=new Mobiles("samsung",40000,"black",4.5f,true);
		Mobiles m2=new Mobiles("oppo",20000,"white",5.4f,false);
		Mobiles m3=new Mobiles("redmi",30000,"greens",5.6f,true);
		Mobiles m4=new Mobiles("realme",30000,"blue",6.7f,false);				
		Mobiles m5=new Mobiles("iphone",100000,"red",6.5f,true);
		
		ArrayList<Mobiles> m=new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
		//filter for whole instance
		List<Mobiles> a=m.stream().filter(x->x.getPrice()>50000).collect(Collectors.toList());
		System.out.println("price instance using filter="+a);
		
		//map for particular data like only price or only brand
		List<Integer> b=m.stream().map(x->x.getPrice()).collect(Collectors.toList());
		System.out.println("getprice using map="+b);
		
		//using filter map
		List<String> c=m.stream().filter(x->x.getBrand().length()>4).map(x->x.getBrand()).collect(Collectors.toList());
		System.out.println("filtermap="+c);
		
		List<Mobiles> c1=m.stream().filter(x->x.getBrand().length()>4).peek(x->x.getBrand()).collect(Collectors.toList());
		System.out.println("peek="+c1);
		
		List<String> d=m.stream().filter(x->x.getBrand().length()%2==0).map(x->x.getBrand()).collect(Collectors.toList());
		System.out.println(d);
		
		// for count using filter
		long e=m.stream().filter(x->x.getPrice()>50000).count();
		System.out.println(e);  
		
		//maximum price price only
		Integer f=m.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
		System.out.println("maximum price price only="+f);
		
		//maximum price for whole price instance
		Mobiles g=m.stream().max(Comparator.comparing(Mobiles::getPrice)).get();
		System.out.println("maximum price for whole price instance="+g);
		
		//sorted() price ascending order
		List<Integer> h=m.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
		System.out.println("sorted() ascending order="+h);
		
		//sorted using string
		List<String> h1=m.stream().map(x->x.getBrand()).sorted().collect(Collectors.toList());
		System.out.println("sorted String="+h1);
		
		//sort brand name only as Descending
		List<String> des=m.stream().map(x -> x.getBrand()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("descendingmapbrand="+des);//[samsung, redmi, realme, oppo, iphone]
				
		//print the values by Descending order of brand name 
		List<Mobiles> bran=m.stream().sorted(Comparator.comparing(Mobiles::getBrand).reversed()).collect(Collectors.toList());
		System.out.println("descendingwholeinstancebrand"+bran);
		
		//second maximum terminal and intermediate based on given last method(here findFirst)
		Integer i=m.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).skip(2).limit(3).findFirst().get();
		System.out.println("Second maximum="+i);
		
		//any match
		boolean j=m.stream().anyMatch(x->x.getBrand().equals("samsung"));
		System.out.println("equals="+j);
		
		//repeated character
		String word="banana";
		Map<Character,Long> as=word.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(as);
		
		Set<Character> ax=as.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toSet());
		System.out.println("repeatedcharacter"+ax);
		
//		List<String> words = Arrays.asList("banana", "apple", "oraange");
//			for(String w:words) {
//        		Map<Character,Long> f1 = w.chars().mapToObj(c11 ->(char)c11)
//                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));
//
//            Set<Character> rep = f1.entrySet().stream()
//                .filter(x-> x.getValue() > 1).map(x->x.getKey()).collect(Collectors.toSet());
//			
//            System.out.println("repwords="+rep);
//			}
		
		//using flatMap
		List<Integer> k=Arrays.asList(1,2,3,4);
		List<Integer> l=Arrays.asList(1,6,7,8);
		List<List<Integer>> n=Arrays.asList(k,l);
		System.out.println(n);
		
		//flatMap using to merge the lists
		List<Integer> o=n.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println("flatmap="+o);
		
		//using distinct(to remove repeated or duplicate values) in flatMap
		List<Integer> q=n.stream().flatMap(x->x.stream()).distinct().collect(Collectors.toList());
		System.out.println("distinct="+q);
		
		//using toSet print particular brand or price only
		Set<Integer> p=m.stream().map(x->x.getPrice()).collect(Collectors.toSet());
		System.out.println("toset="+p);
		
		//using toMap instance=brand or price or color
		Map<Mobiles,String> r=m.stream().collect(Collectors.toMap(x->x,y->y.getBrand()));
		System.out.println("tomap="+r);
		
		//using groupingBy repeated values of=count
		Map<String,Long> s=m.stream().collect(Collectors.groupingBy(x->x.getBrand(),Collectors.counting()));
		System.out.println("Groupingby="+s);
		
		//usingSummingInt sum of price
		Integer t=m.stream().collect(Collectors.summingInt(x->x.getPrice()));
		System.out.println("summingint="+t);
		
		m.stream().filter(x -> x.getPrice() > 60000).map(x -> x.getBrand()).forEach(System.out::println);

		
		// If warranty is true , then discount to price and print netPrice .
		
		List<Mobiles> aa=m.stream().filter(x->x.getWarranty()==true).peek(x->{
						x.setPrice(x.getPrice()-x.getPrice()*5/100);
						}).collect(Collectors.toList());
						System.out.println("netprice="+aa);
		
						
		List<Mobiles> aaa=m.stream().filter(x->x.getWarranty()==true).map(x->{
						x.setPrice(x.getPrice()-x.getPrice()*5/100);
						return x;
						}).collect(Collectors.toList());
						System.out.println("netprice="+aaa);
			
		List<Mobiles> b1=m.stream().filter(x->x.getWarranty()==true)
				.map(x->{x.setPrice(x.getPrice()-999);
				return x;
				})
				.collect(Collectors.toList());
         		System.out.println("warantytrue="+b1); 
		
         List<String> a7=m.stream().map(x->x.getColor().toLowerCase()).collect(Collectors.toList());
         System.out.println("lowercase="+a7); 
	
		//long a=doors.stream().filter(x->x.getPrice()<=1500).count();
		//long a=fans.stream().filter(x->x.getNoOfWings()>3).count();
		
		List<Character> a0=m.stream().map(x->x.getColor().charAt(1)).collect(Collectors.toList());
		System.out.println("firstchar="+a0);
		
		//List<TorchLight> a=torchLights.stream().filter(x->x.getIsChargingType()==false).collect(Collectors.toList());
		
		//List<Employee> a=employees.stream().filter(x->x.getAge()>28).collect(Collectors.toList());
		
		//List<Traveller> a=travellers.stream().filter(x->x.getName().startsWith("A")).collect(Collectors.toList());
		
		//List<Mobiles> z=m.stream().filter(x->!x.getColor().equalsIgnoreCase("blue")).collect(Collectors.toList());
		//System.out.println("NotEqlTo="+z);
		
		List<Character> y=m.stream().map(x->x.getBrand().charAt(x.getBrand().length()-2)).collect(Collectors.toList());
		System.out.println("secondcharacter="+y);
		
		long a1=m.stream().filter(x->x.getColor().startsWith("b")).count();
		System.out.println("strtsWith="+a1);
		
		long a2=m.stream().map(x->x.getPrice()).count();
		System.out.println(a2);
		
		List<String> a3=m.stream().map(x->x.getBrand().toLowerCase()).collect(Collectors.toList());
		System.out.println("brandlowercase="+a3);
		}
	}
class Mobiles{
	private String brand;
	private int price;
	private String color;
	private float width;
	private boolean isWarranty;
	
	public void setWarranty(boolean isWarranty) {
		this.isWarranty=isWarranty;
	}
	public boolean getWarranty() {
		return isWarranty;
	}
	
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
		public Mobiles(String brand, int price, String color, float width,boolean isWarranty) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.width = width;
		this.isWarranty=isWarranty;
	}
	
	public String toString() {
			return "Mobiles [brand=" + brand + ", price=" + price + ", color=" + color + ", width=" + width
					+ ", isWarranty=" + isWarranty + "]";
		}
		
	}
