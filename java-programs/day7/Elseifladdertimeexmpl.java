package day7;

public class Elseifladdertimeexmpl {

	public static void main(String[] args) {
		int time=8;
		if((time>=5)&&(time<12)){
			System.out.println("good morning");
		}
		else if((time>=12)&&(time<16)) {
			System.out.println("good afternoon");
		}
		else if((time>16)&&(time<=20)) {
			System.out.println("good evening");
		}
		else if((time>20)&&(time>=23)) {
			System.out.println("good night");
			
		}
	}

}
