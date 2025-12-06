package PreInterviewCoding;

public class UseSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingle();
		Singleton s2 = Singleton.getSingle();
		Singleton s3 = Singleton.getSingle();
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
}}
class Singleton {
	
	private Singleton() {
		}
	private static Singleton single;
	
	public static Singleton getSingle() {
		if(single==null) {
			single = new Singleton();
		}
		return single;
	}
}