package inheritanceandpolymorphism;

public class Chemistryteacher {

  public static void main(String[] args){
    ChemistryTeacher c= new ChemistryTeacher();
    
    String designation="teacher";
    String collegeName="abcd college";
    String work="chemistryprofessor";
    String subject="chemistry";
    c.setdesignation(designation);
    c.setcollegeName(collegeName);
    System.out.println(c.getdesignation()+" ");
    System.out.println(c.getcollegeName()+" ");
    System.out.println(c.does(work)+" ");
    System.out.println(c.mainSubject(subject));}}


class Teacher {
  private String designation;
  private String collegeName;
   public String does(String work){
     return work;}
  public void setdesignation(String designation){
    this.designation=designation;}
  public void setcollegeName(String collegeName){
    this.collegeName=collegeName;}
  public String getdesignation(){
    return designation;}
  public String getcollegeName(){
    return collegeName;}
}
  
  class ChemistryTeacher extends Teacher {
    public String mainSubject(String subject){
      return subject;}
    public String does(String working){
      return working;}}

