package day3stringarray;

public class worlwidewonder {

	public static void main(String[] args) {
		String name="world,wide,wonder";
		String[] std=name.split(",");
		String std1=std[0];
		String std2=std[1];
		String std3=std[2];
		System.out.println(std1);
		int len=std1.length();
		System.out.println(len);
		String upper=std1.toUpperCase();
		System.out.println(upper);

	}

}
