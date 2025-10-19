package java8;


@FunctionalInterface
 interface Calculator {
	public int getmath(int a,int b);
		
	}
public class Functionallinterface {

	public static void main(String[] args) {
		Calculator add=(x,y)->(x+y);
		System.out.println(add.getmath(10,20));
		Calculator sub=(x,y)->(x-y);
		System.out.println(sub.getmath(20,10));
		Calculator max=(x,y)->{
			if(x>y) {
				return(x);
			}
			else {
				return(y);
			}
		};
	System.out.println(max.getmath(20,10));
	}
}
		

