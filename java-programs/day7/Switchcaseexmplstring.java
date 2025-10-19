package day7;

public class Switchcaseexmplstring {

	public static void main(String[] args) {
		String str="friday";
		switch(str) {
		case "sunday" :
			System.out.println("1st day of the week");
			break;
		case "monday":
			System.out.println("2nd day of the week");
			break;
		case "tuesday":
			System.out.println("3rd day of the week");
			break;
		case "wednesday":
			System.out.println("4th day of the week");
			break;
		case "thursday":
			System.out.println("5th day of the week");
			break;
		case "friday":
			System.out.println("6th day of the week");
			break;
		case "saturday":
			System.out.println("7th day of the week");
			break;
		default:
			System.out.println("none of this");
			break;
			
		}
	}

}
