package oopsEncapsulation;

public class UseCar {

	public static void main(String[] args) {
		
		Engine e=new Engine();
		e.capacity=500;
		e.year=2005;
				
		Car c=new Car();
		c.brand="nexa";
		c.price=2500000;
		c.color="red";
		c.engine=e;
		System.out.println("Brand="+c.brand+" "+"Price="+c.price+" "+"Color="+c.color+" "+"EngineCapacity="+c.engine.capacity+" "+"EngineYear="+c.engine.year);
			}}

class Car{
	String brand;
	int price;
	String color;
	Engine engine;
	}
class Engine {
	int capacity;
	int year;
}
