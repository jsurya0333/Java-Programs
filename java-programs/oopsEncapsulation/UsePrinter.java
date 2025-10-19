package oopsEncapsulation;

public class UsePrinter {

	public static void main(String[] args) {
		Printer[] p= {new Printer("platina","platy","blue",67000),
						new Printer("folcol","folco","red",79000),
						new Printer("makkas","maks","black",4000)};
		for(int i=0;i<p.length;i++) {
			if(p[i].getcolor().equals("black")) {
				System.out.println(p[i].getcolor());
			}
				if(p[i].getprice()>5000) {
					System.out.println(p[i].getprice());
				}
					System.out.println("brand="+p[i].getbrand()+" "+"model="+p[i].getbrand()+"color="+p[i].getcolor()+"price="+p[i].getprice());
				}}}