package oopsEncapsulation;

public class useshirt {

	public static void main(String[] args) {
		shirt s=new shirt("otto",1000,"red",true);
		s.setbrand("allensolly");
		System.out.println(s);
		

	}}
class shirt {
	private String brand;
	private int price;
	private String color;
	private boolean ischecked;

	public shirt(String brand,int price,String color,boolean ischecked) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.ischecked=ischecked;
	}
		public void setbrand(String brand) {
			this.brand=brand;
		}
		public String getbrand() {
			return brand;
		}
		public String toString() {
			return brand+" "+price+" "+color+" "+ischecked;
		}
	}

