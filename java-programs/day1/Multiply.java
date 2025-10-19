package day1;

public class Multiply {
	public static void main(String[] args){
		
			String str=args[0];
			int num=Integer.parseInt(str);			
		    //(1)*(1+2)*(1+2+3)*(1+2+3+4)
		    int sum = 0;
		    int prod = 1;
		    for(int i = 0;i<=num;i++)

		    {
		        int sums= i + sum;
		        sum = sums;
		        prod = sum*i;
		    }
		    System.out.println(str);
		}}
