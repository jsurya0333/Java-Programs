package oopsInheritance;

public class UseHuman {

	public static void main(String[] args) {
		Humman h=new Humman();
		h.name="surya";
		h.age=25;
		h.isgender=true;
		h.height=5.8f;
		
		Teaacher t=new Teaacher();
		t.qualification="BE";
		t.experience=2.5f;
		t.salary=30000;
		t.role="trainer";
		t.name="prakash";
		t.age=24;
		t.isgender=true;
		t.height=5.9f;
		System.out.println(t.name+" "+t.age+" "+t.isgender+" "+t.height+" "+h.name);
	}}
class Humman{
	String name;
	int age;
	boolean isgender;
	float height;
}
class Teaacher extends Humman{
	String qualification;
	float experience;
	int salary;
	String role;
}
