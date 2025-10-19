package dataabstraction;

 abstract class Employee {
	public int getId(int id) {
		return id;
	}
	public abstract String getName(String name);
	public abstract int getAge(int age);
}
 class Teacher extends Employee{
	 public String getName(String name) {
		 return name;
	 }
	 public int getAge(int age) {
		 return age;
	 }
 }
