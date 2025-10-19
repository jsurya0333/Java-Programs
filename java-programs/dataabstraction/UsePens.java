package dataabstraction;

public class UsePens {

	public static void main(String[] args) {
		Penss p=new Penss();
		System.out.println(p.getBrand("reynolds")+" "+p.getModel("rorito")+" "+
							p.getPrice(25)+" "+p.getTipWidth(7.9f));
	}

}
