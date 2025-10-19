package dataabstraction;

public class UseChild {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println("Name:"+c.getName("surya")+" "+"Age:"+c.getAge(25)+" "+
							"Gender:"+c.getGender("male")+" "+"Height:"+c.getHeight(154.6f));			
		}
}
 interface parent1 {
	 public String getName(String name);
	 public int getAge(int age);
	 }
 interface parent2 {
	 public String getGender(String gender);
	 public float getHeight(float height);
	 }
 class Child implements parent1,parent2{
	 public String getName(String name) {
	 return name.toUpperCase();
	  }
	 public int getAge(int age) {
		 return age;
	 }
	 public String getGender(String gender) {
		 return gender.toLowerCase();
	 }
	 public float getHeight(float height) {
		 return height;
	 }
 }
	 
	 
	 
	 