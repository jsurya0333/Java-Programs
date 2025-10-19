package oopsEncapsulation;

public class UseCamera {
	public static void main(String[] args) {
    
    Lense l=new Lense("lensy",50000,"10.5mm");
    
      Camera t=new Camera("Canon",100000,"canonsky",l);
         
         System.out.println(t);
      }
}
 class Camera {
  private String brand;
  private int price;
  private String model;
  private Lense lense;
  
   public Camera(String brand,int price,String model,Lense lense){
    this.brand=brand;
    this.price=price;
    this.model=model;
    this.lense=lense;
    }
      public String toString() {
        return "Brand: "+brand+","+" "+"Price: "+price+","+" "+"Model: "+model+","+" "+lense;
      }
    }
       class Lense {
        private String brand;
        private int price;
        private String focalLength;
        
        public Lense(String brand,int price,String focalLength){
          this.brand=brand;
          this.price=price;
          this.focalLength=focalLength;
        }
          
    public String toString(){
    return "Brand: "+brand+","+" "+"Price: "+price+","+" "+"FocalLength: "+focalLength;
  }
  public void setbrand(String brand){
    this.brand=brand;}
  
  public String getbrand(){
    return brand;}
       }


