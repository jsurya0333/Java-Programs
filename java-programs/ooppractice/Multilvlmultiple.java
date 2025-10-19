package ooppractice;

public class Multilvlmultiple {

	public static void main(String[] args) {
		E c=new E();
		
		System.out.println(c.getAge(23)+" "+
		c.getName("surya")+" "+
		c.getWeight(78.5f)+" "+c.getHeight(156));
		}
	}
interface A{
	public String getName(String name);
}
interface B extends A{
	public int getAge(int age);
}
interface C extends A{
	public int getHeight(int Height);
}
interface D{
	public int getWeight(int weight);
}
class E implements C,B,D{
	public int getAge(int age) {
		return age;
	}
	public String getName(String name) {
		return name;
	}
	public float getWeight(float weight) {
		return weight;
	}
	public int getHeight(int height) {
		return height;
	}
	public int getWeight(int weight) {
		return weight;
	}
}
