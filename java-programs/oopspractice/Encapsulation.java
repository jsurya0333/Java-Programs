package oopspractice;

public class Encapsulation {
	

	public static void main(String[] args) {
		compressor c=new compressor();
		c.setBrand("voltas");
		c.setPrice(3400);
		
		Ac a=new Ac();
		a.setModel("LG");
		a.setSize(23);
		a.setCompressor(c);
		System.out.println(a.getCompressor().getBrand()+" "+a.getCompressor().getPrice()+" "
							+a.getModel()+" "+a.getSize());
	}

}
class compressor{
	private String brand;
	private int price;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getBrand() {
		return brand;
}
	public int setPrice() {
		return price;
}
	public int getPrice() {
		return price;
	}
}
class Ac{
	private String model;
	private int size;
	private compressor comp;
	public void setModel(String model) {
		this.model=model;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public void setCompressor(compressor comp) {
		this.comp=comp;
	}
	public String getModel() {
		return model;
	}
	public int getSize() {
		return size;
	}
	public compressor getCompressor() {
		return comp;
	}
}
	
	
	
	
	
	
	
	

