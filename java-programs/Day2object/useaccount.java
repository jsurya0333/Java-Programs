package Day2object;

public class useaccount {

	public static void main(String[] args) {
		Account a=new Account();
		a.name="mano";
		a.age=26;
		a.gender="male";
		a.monthlyincome=21000;
		a.savings=18;
		a.savingspercentage=a.monthlyincome*a.savings/100;
		System.out.println("name="+a.name+" "+"age="+a.age+" "+"gender="+a.gender+" "+"monthlyincome="+a.monthlyincome+" "+"savings="+a.savings+" "+"savingspercentage="+a.savingspercentage);
	}}