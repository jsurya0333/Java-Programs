package inheritanceandpolymorphism;

public class UseBank {

	public static void main(String[] args) {
		//Axis a=new Axis();
		//System.out.println(a.interest(2000));
		canara c= new canara();
		System.out.println(c.interest(3000));
		//bank b=new bank();
	//	System.out.println(b.interest(30000));
		
		
	}}
  class bank{
	public int interest(int a) {
		return a*3/100;
		}}
	
	 class Axis extends bank{
	public int interest(int b) {
		return b*5/100;
		}}
	 class canara extends bank{
		public int interest(int c) {
			return c*7/100;
			}
	}
