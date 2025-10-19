package oopsInheritance;

public class HybridInheritance {

	public static void main(String[] args) {
		
			masters t=new masters("jsurya",26,"maths","Cricket","guitar");
			System.out.println(t);
			
			doctor d=new doctor("prakash",24,"cardiology","football","violin");
			System.out.println(d);
			
	}}
		interface sport{
			String getsport();
		}
		interface musical{
			String getmusical();
		}

	class Manss{
			String name;
			int age;
			
			public Manss(String name,int age) {
				this.name=name;
				this.age=age;
			}
		public String toString() {
			return "Name:"+name+" "+"Age:"+age;
		}}
	 class masters extends Manss implements sport,musical{
		 String subject;
		 String sport;
		 String musical;
		  public masters(String name,int age,String subject,String sport,String musical) {
			  super(name,age);
			  this.subject=subject;
			  this.sport=sport;
			  this.musical=musical;
		  }
		  public String getsport() {
			  return sport;
		  }
		  public String getmusical() {
			  return musical;
		  }
		  public String toString() {
			  return super.toString()+" "+"Subject:"+subject+" "+"Sport:"+sport+" "+"Musicinstrument:"+musical;
			  
		  }}
	 class doctor extends Manss implements sport,musical {
		 String specilizedin;
		 String sport;
		 String musical;
	 
 public doctor(String name,int age,String specilizedin,String sport,String musical) {
	 super(name,age);
	 this.specilizedin=specilizedin;
	 this.sport=sport;
	 this.musical=musical;
 }
 public String getsport() {
	  return sport;
 }
 public String getmusical() {
	 return musical;
 }
 public String toString() {
	 return super.toString()+" "+"Specilization:"+specilizedin+" "+"Sport:"+sport+" "+"musicalintrmnt:"+musical;
 }
	 
 }

	
