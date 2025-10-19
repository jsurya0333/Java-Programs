package java8;
@FunctionalInterface
	interface Studentss{
		public String getName(String a,String b);
	}
	interface Teacherss{
		public String getSubject(String c);
	}
	class Employees implements Studentss,Teacherss {
		public String getName(String a,String b) {
			return a+b;
		}
		public String getSubject(String c) {
			return c.toUpperCase();
		}
	}
	public class Practicess{
		public static void main(String[] args) {
			Employees e=new Employees();
			System.out.println(e.getName("jaya", "surya"));
			System.out.println(e.getSubject("science"));
		}
	}

//	 interface Student {
//		public String getName();
//		public static String getSubject(String a) {
//			return a;
//		}
//			public default int getId() {
//				return 12;
//			}
//		}
//	class Employee implements Student{
//		public String getName() {
//			return "surya";
//		}
//		public  String getSubject() {
//			return "maths";
//			
//		}
//		public  int getId() {
//			return 14;
//	}
//}
//	public class Practicess{
//		public static void main(String[] args) {
//			Employee e=new Employee();
//			System.out.println(e.getName());
//			System.out.println(e.getId());
//			System.out.println(Student.getSubject("maths"));
//			
//		}
//	}
//	
	
//	interface calci{
//	public int getMath(int a,int b);
//		
//	}
//   class Use{
//	   public int getMath(int a,int b) {
//		   int c=a+b;
//		   return c;
//	   }
//   }
//   public class Practicess{
//	   public static void main(String[] args) {
//		   Use u=new Use();
//		   calci d=u::getMath;
//		   System.out.println(d.getMath(50, 50));
//		   
//	   }
//   }
//upperCasecount-->   

//	interface upper {
//		public int getUpper(String a);
//	}
//	class Uppercase {
//		public int findUpper(String a) {
//			String word1=a;
//			String word2=word1.toUpperCase();
//			int count=0;
//			for(int i=0;i<word1.length();i++) {
//				if(word1.charAt(i)==(word2.charAt(i))) {
//					count++;
//				}
//			}
//			return count;
//		}
//	}
// public class Practicess{
//	 public static void main(String[] args) {
//		 Uppercase u=new Uppercase();
//		 upper o=u::findUpper;
//		 System.out.println(o.getUpper("aPPLe"));
//	 }
// }
   
//-------------------------------------------------------------- 
//printStringname-->
 
//interface name{
//	public String getName(String a);
//	
//}
//class Myname{
//	public String findName(String a) {
//		return a;
//	}
//}
//
//public class Practicess {
//
//	public static void main(String[] args) {
//		Myname m=new Myname();
//		name n=m::findName;
//		System.out.println(n.getName("surya"));
//
//	}
//
//}
   
//   public class use {
//  public static void main(String[] args) {
//    String a=args[0];
//  UseHotel i=new UseHotel();
//  Hotel h=i::nonVegFood;
//    System.out.println(h.vegFood(a));
//  }
//}
//@FunctionalInterface
//interface Hotel {
//  public String vegFood(String foodStatus);
//}
//class UseHotel {
//  public String nonVegFood(String foodStatus){
//    return foodStatus;
//}
//}
//   
   
   
   
