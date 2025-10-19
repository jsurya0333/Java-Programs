package oopsInheritance;
public class SingleInheritance {

	public static void main(String[] args) {
		
		master t=new master("surya",25,5.6f,"javadeveloper",5);
		System.out.println(t);
		}}
class person{
	private String name;
	private int age;
	private float height;

public person(String name,int age,float height) {
	this.name=name;
	this.age=age;
	this.height=height;
}
public String toString() {
	return "Name:"+name+" "+"Age:"+age+" "+"Height:"+height;
}}
class master extends person{
	 private String role;
	private int experience;
	
	public master  (String name,int age,float height,String role,int experience) {
		super(name,age,height);
		this.role=role;
		this.experience=experience;
		}
	public String toString() {
		return super.toString()+" "+"Role:"+role+" "+"Exp:"+experience;
	}}

