package dataabstraction;

public class UseChildss {

	public static void main(String[] args) {
		Employees e=new Employees();
		System.out.println("NAME:"+e.getName("surya")+" "+"AGE:"+e.getAge(24)+" "+"HEIGHT:"+
							e.getHeight(154)+" "+"ID:"+e.getId(12));

	}

}
interface aa{
	public String getName(String name);
	}
interface bb extends aa{
	public int getAge(int age);
	}
interface cc extends bb{
	public int getHeight(int height);
}
interface dd extends cc{
	public int getId(int id);
}
class Employees implements dd{
	public String getName(String name) {
		return name;
	}
	public int getAge(int age) {
		return age;
	}
	public int getHeight(int height) {
		return height;
	}
	public int getId(int id) {
		return id;
	}
}