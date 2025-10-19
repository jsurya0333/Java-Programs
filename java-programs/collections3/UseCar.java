package collections3;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UseCar {
  public static void main(String[] args) {
    
    String[] s1=args[0].split(",");
    String[] s2=args[1].split(",");
    String[] s3=args[2].split(",");
    
    Car car1=new Car(s1[0],Integer.parseInt(s1[1]),Boolean.parseBoolean(s1[2]));
    Car car2=new Car(s2[0],Integer.parseInt(s2[1]),Boolean.parseBoolean(s2[2]));
    Car car3=new Car(s3[0],Integer.parseInt(s3[1]),Boolean.parseBoolean(s3[2]));   
    
    ArrayList<Car> cars=new ArrayList<>();
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    
    List<Car> a=cars.stream().filter(x->x.getBrand().endsWith("i")).collect(Collectors.toList());
         a.forEach(x->System.out.println(x));                           
     }
}
class Car {
  private String brand;
  private int price;
  private boolean isElectric;
  
  public Car(String brand,int price,boolean isElectric){
    this.brand=brand;
    this.price=price;
    this.isElectric=isElectric;
  }
    public void setBrand(String brand){
    this.brand=brand;
  }
  public String getBrand(){
    return brand;
  }
  public int getPrice(){
    return price;
  }
  public Boolean getIsElectric() {
    return isElectric;
  }
  public String toString(){
    return getBrand()+","+getPrice()+","+getIsElectric();
  }
}

