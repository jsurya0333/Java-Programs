package day7;

public class Switchcase {

	public static void main(String[] args) {
		char ch='N';
		switch(ch) {
		case 'E':
			System.out.println("East");
			break;
		case 'W':
			System.out.println("west");
			break;
		case 'N':
			System.out.println("North");
			break;
		case 's':
			System.out.println("South");
			break;
		default:
			System.out.println("invalid direction");
			break;
		}

	}

}
