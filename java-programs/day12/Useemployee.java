package day12;

public class Useemployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Anitha";
		e.age=25;
		e.salary=1500;
		e.gender="female";
		e.exp=2;
		
		Employee e1=new Employee();
		e1.name="varun";
		e1.age=24;
		e1.salary=100000;
		e1.gender="male";
		e1.exp=2;

		Employee e2=new Employee();
		e2.name="vaishuss";
		e2.age=23;
		e2.salary=1250000;
		e2.gender="female";
		e2.exp=5;
		
		Employee e3=new Employee();
		e3.name="Ajay";
		e3.age=25;
		e3.salary=1350000;
		e3.gender="male";
		e3.exp=6;
		
		Employee[] emps= {e,e1,e2,e3};
		for (int i=0;i<emps.length;i++)
		{
			System.out.println(emps[i].name +" "+ emps[i].age+" "+emps[i].salary+" "+emps[i].gender+" "+emps[i].exp);
		}
		for(int i=0;i<emps.length;i++)
		{
			if(emps[i].gender.equals("male"))
			{
				System.out.println(emps[i].name +" "+ emps[i].age+" "+emps[i].salary+" "+emps[i].gender+" "+emps[i].exp);
			}}
			for(int i=0;i<emps.length;i++)
			{
				if(emps[i].exp>3)
				{
					System.out.println(emps[i].name +" "+ emps[i].age+" "+emps[i].salary+" "+emps[i].gender+" "+emps[i].exp);
				}}
			Employee max=emps[0];
			for(int i=0;i<emps.length;i++)
			{
				if(emps[i].name.length()>max.name.length())
				{
					max=emps[i];
				}
			}
			Employee min=emps[0];
			for(int i=0;i<emps.length;i++) {
				if(emps[i].salary<min.salary) {
					min=emps[i];
				}
			}}}
			
			

			
			
		
	


















