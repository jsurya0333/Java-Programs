package PreInterviewCoding;

import java.util.ArrayList;

public class ArrayListaddanother {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add(15);
		a.add(18);
		a.add(17);
		
		ArrayList<Integer> b=new ArrayList<>();
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i)%2==0) {
				b.add(a.get(i));
			}
		}
		System.out.println(b);
	}
}
