package Day4;

public class UseSportsShoe {

	public static void main(String[] args) {
		String str=args[0];
		SportsShoe shoe=new SportsShoe();
		shoe.price=Integer.parseInt(args[0]);
		shoe.color=args[1];
		shoe.discountAmount=Integer.parseInt(args[2]);
		shoe.netPrice=shoe.price-shoe.discountAmount;
		System.out.println(shoe.color+", "+"NET PRICE:"+shoe.netPrice);
		shoe.upper=shoe.color.toUpperCase();
		System.out.println(shoe.upper);
		
		
		
		

	}

}
