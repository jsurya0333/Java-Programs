package oopspractice;

public class composition {
	//one object inside another object
	//it has a relationship with another object
	//it has a relationship and loosely coupled
	//combination of class and object example:mobile has battery car has engine
	public static void main(String[] args) {
		Engine e=new Engine();
		e.capacity=5000;
		e.year=2002;
		Car c=new Car();
		c.brand="nexon";
		c.price=38757626;
		c.engine=e;
		System.out.println(c.brand+" "+c.price+" "+c.engine.capacity
							+" "+c.engine.year);
		}
	}
class Engine {
	int capacity;
	int year;
}
class Car{
	String brand;
	int price;
	Engine engine;
	}