package collections2;

import java.util.HashMap;
import java.util.Iterator;

public class Maplmsname {

	public static void main(String[] args) {
		HashMap<Integer,String> lms=new HashMap<>();
		lms.put(1780,"surya");
		lms.put(1781,"prakash");
		lms.put(1782,"ajay");
		lms.get(1780);
		System.out.println(lms.size());
		System.out.println(lms.keySet());
		System.out.println(lms.values());
		
		//forEach doesn't return single output. only multiple outputs.
		lms.values().forEach(x->System.out.println(x));
		lms.keySet().forEach(x->System.out.println(x));
		lms.forEach((x,y)->System.out.println(x+"="+y));
		lms.keySet().forEach(x->System.out.println(x+"="+lms.get(x)));
		
		lms.values().forEach(x->{
			if(x.length()%2==0){
				System.out.println(x);
				}});
		
		lms.keySet().forEach(x->{
			if(x%2==0) {
				System.out.println(x);
				}});
		
		for(Integer x:lms.keySet()) {
			System.out.println(x+" "+lms.get(x));
		}
		for(String x:lms.values()) {
			System.out.println(x);
		}
		//using keySet to find maximum length
		String max=lms.get(1780);
		for(Integer x:lms.keySet()) {
			if(lms.get(x).length()>max.length()) {
				max=lms.get(x);
			}
		}
		System.out.println(max);
		//using values to find maximum length
		String max1=lms.get(1780);
		for(String x:lms.values()) {
			if(x.length()>max1.length()) {
				max1=x;
			}
		}
		System.out.println(max1);
		}
	}
