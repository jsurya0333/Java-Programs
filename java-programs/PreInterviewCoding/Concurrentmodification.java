package PreInterviewCoding;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrentmodification {

	public static void main(String[] args) {
		
		//ArrayList<Integer> a=new ArrayList<>();
		CopyOnWriteArrayList<Integer> a=new CopyOnWriteArrayList<>();
		a.add(10);
		a.add(20);
		a.add(15);
		a.add(18);
		a.add(17);
		for(int i=0;i<a.size();i++) {
			
			if(a.get(i)%2==0) {
				a.add(2);
			}
		}
		System.out.println(a);
	}

}
