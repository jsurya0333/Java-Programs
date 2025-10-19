package day18Functions;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.brand="samsung";
		m.color="blackey";
		m.price=40000;
		
		Mobile m1=new Mobile();
		m1.brand="apple";
		m1.color="green";
		m1.price=540000;
		
		Mobile m2=new Mobile();
		m2.brand="redmi";
		m2.color="white";
		m2.price=15000;
		
		Mobile m3=new Mobile();
		m3.brand="realme";
		m3.color="pink";
		m3.price=20000;
		
		Mobile[] mobs= {m,m1,m2,m3};
		
		Mobile max=mobs[0];

		for(Mobile x:mobs) {
			if(max.price<x.price) {
				max=x;
			}
		}
			System.out.println(max.brand+" "+max.price);//apple
			Mobile maxs=mobs[0];

			for(Mobile x:mobs) {
				if(maxs.brand.length()<x.brand.length()) {
					maxs=x;
				}}
			System.out.println(maxs.brand+" "+maxs.price);//realme
			Mobile maxss=mobs[0];

			for(Mobile x:mobs) {
				if(x.color.length()>maxss.color.length()) {
					maxss=x;
				}}
			System.out.println(maxss.brand+" "+maxss.color);//samsung
			Mobile min=mobs[0];

			for(Mobile x:mobs) {
				if(min.price>x.price) {
					min=x;
				}}
			System.out.println(min.brand+" "+min.price);//redmi
			
			for(Mobile x:mobs) {
				char ch=x.brand.charAt(x.brand.length()-1);
				System.out.println(ch);
			}
	}}

