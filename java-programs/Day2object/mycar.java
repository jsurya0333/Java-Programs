package Day2object;

public class mycar {
	public static void main(String[]args) {
		car c=new car();
		c.brand="ford";
		c.color="red";
		c.price=5478943.6f;
		c.taxpercentage=10.5f;
		c.isairbag=true;
		float percentvalue=(c.price*c.taxpercentage)/100;
		float netprice=c.price+percentvalue;
		System.out.println("brand="+c.brand+" "+"price="+c.price+" "+"color="+c.color+" "+"taxpercentage="+c.taxpercentage+" "+"airbag="+c.isairbag+" "+"netvalue="+percentvalue+" "+"netprice="+netprice);
		
		car c1=new car();
		c1.brand="skoda";
		c1.color="blue";
		c1.price=54767843.6f;
		c1.taxpercentage=20.5f;
		c1.isairbag=false;
		float percentvalue1=(c1.price*c.taxpercentage)/100;
		float netprice1=c1.price+percentvalue1;
		System.out.println("brand="+c1.brand+" "+"price="+c1.price+" "+"color="+c1.color+" "+"taxpercentage="+c1.taxpercentage+" "+"airbag="+c1.isairbag+" "+"netvalue1="+percentvalue1+" "+"netprice1="+netprice1);

	
	
	
	
	
	
	
	
	}

}
