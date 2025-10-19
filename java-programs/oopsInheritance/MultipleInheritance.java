package oopsInheritance;

public class MultipleInheritance {

	public static void main(String[] args) {
		teacher t=new teacher("jsurya",26,"maths","Cricket","guitar");
		System.out.println(t);
		
}}
	interface Sports{
		String getsports();
	}
	interface Musics{
		String getmusic();
	}

class Mans{
		String name;
		int age;
		
		public Mans(String name,int age) {
			this.name=name;
			this.age=age;
		}
	public String toString() {
		return "Name:"+name+" "+"Age:"+age;
	}}
 class teacher extends Mans implements Sports,Musics{
	 String subject;
	 String Sports;
	 String Musics;
	  public teacher(String name,int age,String subject,String Sports,String Musics) {
		  super(name,age);
		  this.subject=subject;
		  this.Sports=Sports;
		  this.Musics=Musics;
	  }
	  public String getsports() {
		  return Sports;
	  }
	  public String getmusic() {
		  return Musics;
	  }
	  public String toString() {
		  return super.toString()+" "+"Subject:"+subject+" "+"Sport:"+Sports+" "+"Musicinstrument:"+Musics;
		  
	  }}
