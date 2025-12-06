package PreInterviewCoding;


final class Student {

			private final String name;
			private final int age;
			

			public Student(String name, int age) {
					this.name = name;
					this.age = age;
					
			}

			public String getName() {
				return name;
			}

			public int getAge() {
				return age;
			}
	}
	public class Immutable {
		public static void main(String[] args) {

				Student s1 = new Student("saran", 25);

					System.out.println(s1.getName());  
					System.out.println(s1.getAge());//saran 25
					
					
		}
}