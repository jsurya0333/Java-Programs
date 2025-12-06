package PreInterviewCoding;

public class Finalize {
	public void finalize() {
		System.out.println("object is removed");
		
	}
public static void main(String[] args) {
	
	Finalize s=new Finalize();
	System.out.println(s.hashCode());
	System.gc();
	
	Finalize s1=new Finalize();
	System.out.println(s1.hashCode());
	System.gc();
	
	s=new Finalize();
	System.gc();
	
	
	
}
}
