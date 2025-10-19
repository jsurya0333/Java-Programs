package oopspractice;

public class Interfaceabstraction {

	public static void main(String[] args) {
		Student s=new Student();
		s.getName("surya");
		s.getId(22);
		s.getHeight(154.5f);
		s.getWeight(88.8f);
		System.out.println(s.getName("surya")+" "+s.getId(22)+" "+s.getHeight(154.5f)+" "+s.getWeight(88.8f));
	}
}
interface a{
	public String getName(String name);
}
interface b{
	public int getId(int id);
}
interface c{
	public float getHeight(float height);
}
abstract class d{
	public  float getWeight(float weight) {
		return weight;
	}
}
class Student extends d implements a,b,c{
	public String getName(String name) {
		return name;
	}
	public int getId(int id) {
		return id;
	}
	public float getHeight(float height) {
		return height;
	}
}
	