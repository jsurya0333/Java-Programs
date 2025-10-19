package inheritanceandpolymorphism;

public class UseEmployee {

	public static void main(String[] args) {
		softwareengineer s=new softwareengineer();
		s.name="prakash";
		s.id=5821;
		s.department="electronisengineer";
		s.deptid=25;
		s.designation="java developer";
		s.salary=100000;
		System.out.println("Name:"+s.name+" "+"ID:"+s.id+" "+"Department:"+s.department+" "+"desingnation:"+s.designation);
		
	}}
class employee{
	String name;
	int id;
}
class engineer extends employee{
	String department;
	int deptid;
}
class softwareengineer extends engineer{
	String designation;
	int salary;
}