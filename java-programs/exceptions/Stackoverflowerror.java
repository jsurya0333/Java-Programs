package exceptions;

public class Stackoverflowerror {

	public static void main(String[] args) {
		sayHello();
    	}

    public static void sayHello() {
        System.out.println("Hello world");
        sayHello(); // calls itself again (infinite recursion)
    			}
		}


