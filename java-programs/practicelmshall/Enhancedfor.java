package practicelmshall;

public class Enhancedfor {
	public static void main(String[] args) {
		Phone m=new Phone();
		m.brand="samsung";
		m.color="blackey";
		m.price=40000;
		
		Phone m1=new Phone();
		m1.brand="apple";
		m1.color="green";
		m1.price=540000;
		
		Phone m2=new Phone();
		m2.brand="redmi";
		m2.color="white";
		m2.price=15000;
		
		Phone m3=new Phone();
		m3.brand="realme";
		m3.color="pink";
		m3.price=20000;
	
	Phone[] mob= {m,m1,m2,m3};
	Phone max=mob[0];
	for(Phone x:mob) {
		if(max.price<x.price) {
			max=x;
		}
	}
		System.out.println(max);
		Phone maxs=mob[0];
		for(Phone x:mob) {
			if(maxs.brand.length()<x.brand.length()) {
				maxs=x;
			}
		}
		System.out.println(maxs);
		for(Phone x:mob) {
			char ch=x.color.charAt(x.color.length()-1);
				System.out.println(ch);  
			}
			
		}
	}









