package collections2;

import java.util.HashMap;

public class Names {

	public static void main(String[] args) {
		HashMap<Integer,String> names=new HashMap<>();
		names.put(1,"surya");
		names.put(2,"jaya");
		names.put(3,"prakash");
		names.put(4,"jaya");
		names.remove(1);
		names.put(1,"surya");
		//System.out.println(names.get(2));
		//System.out.println(names);
		//System.out.println(names.values());
		//System.out.println(names.keySet());
		//names.forEach((x,y)->System.out.println(x+" "+y));
		
		//names.values().forEach((y)->System.out.println(y));
		
		//names.keySet().forEach((x)->System.out.println(x+" "+names.get(x)));
		//for(String x:names.values()) {
			//System.out.println(x);
		//}
		//for(Integer y:names.keySet()) {
			//System.out.println(y+" "+names.get(y));
		//}
		HashMap<Integer,String> a=new HashMap<>();
		a.put(5,"hello");
		a.get(5);
		a.size();
		a.put(5,"hi");
		a.keySet().forEach(x->System.out.println(a.get(x).charAt(a.get(x).length()-1)));
		//a.values().forEach(x->System.out.println(x.charAt(x.length()-1)));
	}
}

