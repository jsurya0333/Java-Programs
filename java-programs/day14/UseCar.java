package day14;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=args[0].split(",");
		String[] str1=args[1].split(",");
		String[] str2=args[2].split(",");
		Car car1 =new Car ();
		car1.name=str[0];
		car1.distance=Integer.parseInt(str[1]);
		car1.price=Integer.parseInt(str[2]);
		
		Car car2=new Car();
		car2.name=str1[0];
		car2.distance=Integer.parseInt(str1[1]);
		car2.price=Integer.parseInt(str1[2]);
		
		Car car3=new Car();
		car3.name=str2[0];
		car3.distance=Integer.parseInt(str2[1]);
		car3.price=Integer.parseInt(str2[2]);
		
		Car[] cars = {car1,car2,car3};
		int totaldistance=0;
		int totalprice=0;
		for(int i=0;i<cars.length;i++)
		{
			totaldistance=totaldistance+cars[i].distance;
			totalprice=totalprice+cars[i].price;
		}
		System.out.println("TOTAL DISTANCE="+totaldistance);
		System.out.println("TOTAL PRICE="+totalprice);
		
		
		
		
		
	}

}
