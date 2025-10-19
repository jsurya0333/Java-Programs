package inheritanceandpolymorphism;

public class UseweekDay {
public static void main(String[] args) {
    Weekday w=new Weekday();
    w.findDay(args[0]);
    w.findDay(args[1],Integer.parseInt(args[2]));
    
    }}
class Weekday {
  public void findDay(String day1){
    if(day1.equalsIgnoreCase("monday")||day1.equalsIgnoreCase("tuesday")||day1.equalsIgnoreCase("wednesday")||day1.equalsIgnoreCase("thursday")||day1.equalsIgnoreCase("friday")){
      System.out.println("Weekday");
    }
       else{
         System.out.println("Weekend");
       }
     }
  public void findDay(String day2,int month){
    if(day2.equalsIgnoreCase("monday")||day2.equalsIgnoreCase("tuesday")||day2.equalsIgnoreCase("wednesday")||day2.equalsIgnoreCase("thursday")||day2.equalsIgnoreCase("friday")){
      System.out.println("Weekday");
    }
       else{
         System.out.println("Weekend");
       }
       switch(month) {
         case 1: System.out.println("January");
         break;
         case 2: System.out.println("February");
         break;
         case 3: System.out.println("March");
         break;
         case 4: System.out.println("April");
         break;
         case 5: System.out.println("May");
         break;
         case 6: System.out.println("June");
         break;
         case 7: System.out.println("July");
         break;
         case 8: System.out.println("August");
         break;
         case 9: System.out.println("September");
         break;
         case 10: System.out.println("October");
         break;
         case 11: System.out.println("November");
         break;
         case 12:System.out.println("December");
         break;
         default: System.out.println("invalid month");
       }
       }
}
