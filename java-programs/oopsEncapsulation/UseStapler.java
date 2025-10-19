package oopsEncapsulation;

public class UseStapler {

	public static void main(String[] args) {
		Stapler[] s= {new Stapler("celio",10,"red","iron"),
				new Stapler("kangroo",20,"blue","plastic"),
				new Stapler("rorito",30,"white","metal")};
		
		for(int i=0;i<s.length;i++) {
			System.out.println("brand="+s[i].getbrand()+" "+"price="+s[i].getprice()+" "+"color="+s[i].getcolor()+" "+"material="+" "+s[i].getmaterial());
			
			}}}


