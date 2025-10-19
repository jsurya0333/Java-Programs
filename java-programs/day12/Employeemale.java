package day12;

public class Employeemale {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Anitha";
		e.age=25;
		e.salary=150000;
		e.gender="male";
		e.exp=5;
		
		Employee e1=new Employee();
		e1.name="varun";
		e1.age=24;
		e1.salary=100000;
		e1.gender="male";
		e1.exp=4;

		Employee e2=new Employee();
		e2.name="vaishu";
		e2.age=23;
		e2.salary=1250000;
		e2.gender="female";
		e2.exp=5;
		
		Employee e3=new Employee();
		e3.name="Ajay";
		e3.age=25;
		e3.salary=1350000;
		e3.gender="male";
		e3.exp=5;
		
		Employee[] emps= {e,e1,e2,e3};
		for (int i=0;i<emps.length; i++)
		{
			if(emps[i].gender.equals("male"))
			{
			System.out.println(emps[i]);
		}}
	}}


