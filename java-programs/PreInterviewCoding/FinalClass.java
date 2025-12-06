package PreInterviewCoding;

final class Car {
	 
	String brand;
	int price;
	
}

public class FinalClass {
    public static void main(String[] args) {
        Car a = new Car();  // ✔ Allowed
        //a.brand="AUDI";
        a.price=76589000;
        
        System.out.println(a.brand="Audi"+" "+a.price);
        
    }
}
