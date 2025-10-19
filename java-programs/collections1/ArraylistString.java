package collections1;
import java.util.ArrayList;

public class ArraylistString {
	
public static void main(String[] args) {
	
		ArrayList<String> a=new ArrayList<>();
		a.add("jaya");
		a.add("surya");
		a.add("k");
		
		//int s=a.size();
		//for(int i=0;i<s;i++) {
			//System.out.println(a.get(i));
		//}
		for(String x:a) {
			System.out.println(x.charAt(x.length()-1));
		}
		String max=a.get(0);
		for(String y:a) {
			if(y.length()>max.length()) {
				max=y;
			}
		}
			System.out.println(max);
	}
}

