package oopsEncapsulation;

public class UseLaptop {
public static void main(String[] args) {
    
    MotherBoard c=new MotherBoard("mother",50000,"500gb");
    
      Laptop p=new Laptop("Lenovo",150000,"Thinkpad",c);
         
         System.out.println(p);
      }
}
 class Laptop {
  private String brand;
  private int price;
  private String model;
  private MotherBoard motherBoard;
  
  public Laptop(String brand,int price,String model,MotherBoard motherBoard){
    this.brand=brand;
   this.price=price;
   this.model=model;
    this.motherBoard=motherBoard;
   }
      public String toString() {
        return "Brand: "+brand+","+" "+"Price: "+price+","+" "+"Model: "+model+","+" "+motherBoard;
      }}
 class MotherBoard{
  private String brand;
  private int price;
  private String RAMType;
    
    public MotherBoard(String brand,int price,String RAMType){
    this.brand=brand;
    this.price=price;
    this.RAMType=RAMType;
  }
  public String toString() {
    return "Brand: "+brand+","+" "+"Price: "+price+","+" "+"RAMType: "+RAMType;
  }
   public void setbrand(String brand){
    this.brand=brand;}
  
  public String getbrand(){
    return brand;}
       
}
