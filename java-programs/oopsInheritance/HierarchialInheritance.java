package oopsInheritance;

public class HierarchialInheritance {

	public static void main(String[] args) {
		
		Student s=new Student("praksh",25,5.6f,5);
		System.out.println(s);
		
		Man m=new Man("vijay",34,7.9f);
		System.out.println(m);
		
		Professors p=new Professors("arun",23,6.5f,"trainer",5);
		System.out.println(p);
		}}
	class Man{
	private String name;
	private int age;
	private float height;

	public Man (String name,int age,float height) {
	this.name=name;
	this.age=age;
	this.height=height;
}
	public String toString() {
	return "Name:"+name+" "+"Age:"+age+" "+"Height:"+height;
}}
	class Professors extends Man{
	 private String role;
	private int experience;
	
	public Professors  (String name,int age,float height,String role,int experience) {
		super(name,age,height);
		this.role=role;
		this.experience=experience;
		}
	public String toString() {
		return super.toString()+" "+"Role:"+role+" "+"Exp:"+experience;
	}}
	class Student extends Man {
	int grade;
	
	 public Student (String name,int age,float height,int grade) {
		super (name,age,height);
		this.grade=grade;
	 }
	 public String toString() {
		 return super.toString()+" "+"grade:"+grade;
	 }}






