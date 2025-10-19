package oopsInheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Mathteacher m=new Mathteacher("surya",25,5.6f,"javadeveloper",5,"maths");
		System.out.println(m);
	}}
class Humanss{
	private String name;
	private int age;
	private float height;

public Humanss(String name,int age,float height) {
	this.name=name;
	this.age=age;
	this.height=height;
}
public String toString() {
	return "Name:"+name+" "+"Age:"+age+" "+"Height:"+height;
}}
class Teacherss extends Humanss{
	 private String role;
	private int experience;
	
	public Teacherss  (String name,int age,float height,String role,int experience) {
		super(name,age,height);
		this.role=role;
		this.experience=experience;
		}
	public String toString() {
		return super.toString()+" "+"Role:"+role+" "+"Exp:"+experience;
	}}
class Mathteacher extends Teacherss {
	String subject;
	public Mathteacher(String name,int age,float height,String role,int experience,String subject) 
	{
		super(name,age,height,role,experience);
		this.subject=subject;
	}
	public String toString() {
		return super.toString()+" "+"subject:"+subject;
}}

	

