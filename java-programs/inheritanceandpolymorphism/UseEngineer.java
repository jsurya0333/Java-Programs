package inheritanceandpolymorphism;

public class UseEngineer {

	public static void main(String[] args){
    String[] str=args[0].split(",");
    String designation=str[0];
    String workingSector=str[1];
    int salary=Integer.parseInt(str[2]);
    String work=str[3];
    CivilEngineer c= new CivilEngineer();
    c.setDesignation(designation);
    c.setWorkingSector(workingSector);
    
    System.out.println(c.getDesignation());
    System.out.println(c.getWorkingSector());
     System.out.println(c.showSalary(salary));
     System.out.println(c.typeOfWork(work));
  }}
    class Engineer {
  private String designation;
  private String workingSector;
  
  public int showSalary(int salary){
    return salary;
  }
  public void setDesignation(String designation){
    this.designation=designation;
}
  public void setWorkingSector(String workingSector){
    this.workingSector=workingSector;
  }
  public String getDesignation(){
    return designation;
  }
  public String getWorkingSector(){
    return workingSector;
  }
}
class CivilEngineer extends Engineer {
  public String typeOfWork(String work){
    return work;
  }
  public int showSalary(int pay){
    return pay;
  }
}