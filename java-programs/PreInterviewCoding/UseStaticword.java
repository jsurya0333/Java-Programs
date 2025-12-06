package PreInterviewCoding;

public class UseStaticword {
	public static void main(String[] args) {
		
		//System.out.println(Staticword.b);
		Staticword s=new Staticword();
		System.out.println(s.a);
		System.out.println(s.b);
		
		Staticword s1=new Staticword();
		System.out.println(s1.a);
		System.out.println(s1.b);
		}
}
class Staticword {

	static int a=10;
	static int b=20;
	
	public Staticword() {
		a++;
		b++;
	}
	

	}