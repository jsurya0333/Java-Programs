package oopsEncapsulation;

public class UseAc {
	
public static void main(String[] args) {
		compressor c=new compressor();
		c.setprice(25000);
		c.setyear(2007);
		Ac a=new Ac();
		a.setbrand("lg");
		a.setprice(34000);
		a.setcompressor(c);
		System.out.println("brand="+a.getbrand()+" "+"price="+a.getprice()+" "+"compressorprice="+a.getcompressor().getprice()+" "+"compressoryear="+a.getcompressor().getyear());
			
		}}
	class compressor{
		private int price;
		private int year;

		public void setprice(int price) {
			this.price=price;
		}
		public void setyear(int year) {
			this.year=year;
		}
		
		public int getprice() {
			return price;
		}
		public int getyear() {
			return year;
		}}
		class Ac{
			private String brand;
			private int price;
			private compressor compress;
			
			public void setbrand(String brand) {
				this.brand=brand;
			}
			public void setprice(int price) {
				this.price=price;
			}
			public void setcompressor(compressor compress) {
				this.compress=compress;
			}
			
			public String getbrand() {
				return brand;
			}
			public int getprice() {
				return price;
			}
			public compressor getcompressor() {
				return compress;
			}}