package collections3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UseBorrower {
  public static void main(String[] args) {
    
    String[] s1=args[0].split(",");
    String[] s2=args[1].split(",");
    String[] s3=args[2].split(",");
    
    Borrower borrower1=new Borrower(s1[0],Integer.parseInt(s1[1]),Integer.parseInt(s1[2]));
    Borrower borrower2=new Borrower(s2[0],Integer.parseInt(s2[1]),Integer.parseInt(s2[2]));
    Borrower borrower3=new Borrower(s3[0],Integer.parseInt(s3[1]),Integer.parseInt(s3[2]));   
    
    ArrayList<Borrower> borrowers=new ArrayList<>();
    borrowers.add(borrower1);
    borrowers.add(borrower2);
    borrowers.add(borrower3);
    
    List<Borrower> a=borrowers.stream().filter(x->x.getDebtAmount()>1000000).collect(Collectors.toList());
         a.forEach(x->System.out.println(x));                           
     }
}
class Borrower {
  private String name;
  private int debtyear;
  private int debtamount;
  
  public Borrower(String name,int debtyear,int debtamount){
    this.name=name;
    this.debtyear=debtyear;
    this.debtamount=debtamount;
  }
    public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public int getDebtYear(){
    return debtyear;
  }
  public int getDebtAmount() {
    return debtamount;
  }
  public String toString(){
    return getName()+","+getDebtYear()+","+getDebtAmount();
  }
}

