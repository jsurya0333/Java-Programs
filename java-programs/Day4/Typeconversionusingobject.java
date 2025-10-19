package Day4;

public class Typeconversionusingobject {

	public static void main(String[] args) {
		String[] str=args[0].split(",");
		pen p=new pen();
		p.brand=str[0];
		p.color=str[1];
		p.price=Integer.parseInt(str[2]);
		p.tipwidth=Float.parseFloat(str[3]);
		System.out.println(p.brand+" "+p.color+" "+p.price+" "+p.tipwidth);
		String[] str1=args[1].split(",");
		pen p1=new pen();
		p1.brand=str1[0];
		p1.color=str1[1];
		p1.price=Integer.parseInt(str1[2]);
		p1.tipwidth=Float.parseFloat(str1[3]);
		System.out.println(p1.brand=" "+p1.color+" "+p1.price+" "+p1.tipwidth);
		System.out.println("brand="+p.brand+" "+"color="+p.color+" "+"price="+p.price+" "+"p.tipwidth="+p.tipwidth);
		System.out.println("brand="+p1.brand+" "+"color="+p1.color+" "+"price="+p1.price+" "+"p.tipwidth="+p1.tipwidth);
		
		
		

	}

}
