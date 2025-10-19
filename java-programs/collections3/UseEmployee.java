package collections3;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UseEmployee {
  public static void main(String[] args) {
    String[] s1=args[0].split(",");
    String[] s2=args[1].split(",");
    String[] s3=args[2].split(",");
    Employee employee1=new Employee(s1[0],Integer.parseInt(s1[1]),Boolean.parseBoolean(s1[2]));
    Employee employee2=new Employee(s2[0],Integer.parseInt(s2[1]),Boolean.parseBoolean(s2[2]));
    Employee employee3=new Employee(s3[0],Integer.parseInt(s3[1]),Boolean.parseBoolean(s3[2]));                                
    ArrayList<Employee> employees=new ArrayList<>();
    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);
    List<Employee> a=employees.stream().filter(x->x.getIsMarried()==true).collect(Collectors.toList());
         a.forEach(x->System.out.println(x));                           
    
  }
}
class Employee {
  private String name;
  private int age;
  private boolean isMarried;
  
  public Employee(String name,int age,boolean isMarried){
    this.name=name;
    this.age=age;
    this.isMarried=isMarried;
  }
    public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public boolean getIsMarried() {
    return isMarried;
  }
  public String toString(){
    return getName()+","+getAge()+","+getIsMarried();
  }
}
  