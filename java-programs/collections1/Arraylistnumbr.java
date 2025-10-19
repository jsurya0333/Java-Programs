package collections1;

import java.util.ArrayList;

public class Arraylistnumbr {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);//replaced by 4
		a.add(2);
		a.add(3);//removed
		a.get(0);
		a.set(0,4);
		a.remove(2);
		int s=a.size();
		for(int i=0;i<s;i++) {
			System.out.println(a.get(i));
			}
		for(int x:a) {
			System.out.println(x);
			}
		int max=a.get(0);
		for(int y:a) {
			if(y>max) {
				y=max;
			}
		}
		System.out.println(max);
	}
}
