package ooppractice;

public class Sstudent {

	public static void main(String[] args) {
		U e=new U();
		System.out.println(e.getName("surya")+" "+e.getAge(25)+
				" "+e.getHeight(154.6f)+" "+e.getWeight(78.9f)+
				" "+e.getId(100));
	}

}
interface X{
	public String getName(String name);
}
interface Y{
	public int getAge(int age);
}
interface Z{
	public float getHeight(float height);
}
abstract class T{
	public float getWeight(float weight) {
		return weight;
	}
	public abstract int getId(int id);
}
class U extends  T implements X,Y,Z {
	public String getName(String name) {
		return name;
	}
	public int getAge(int age) {
		return age;
	}
	public float getHeight(float height) {
		return height;
	}
	public  int getId(int id) {
		return id;
	}
	
}






