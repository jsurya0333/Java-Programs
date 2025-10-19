package Extracoding;

public class useStudent{
	
	public static void main(String[] args) {
		Student s1=new Student("ajay",700);
		Student s2=new Student("vijay",200);
		Student s3=new Student("sanjay",900);
		
		s1.dispalay();
		s2.dispalay();
		s3.dispalay();
		Student.totalcount();
		
	}
}
 class Student {
	static int studentcount=0;
	final String schoolname="abc";
	
	int fees;
	String name;
	Student(String name,int fees){
		this.fees=fees;
		this.name=name;
		studentcount++;
	}
	void dispalay() {
		System.out.println(name);
		System.out.println(fees);
		System.out.println(schoolname);
	}
	public static void totalcount() {
		System.out.println(studentcount);
	}
}
 
	


