package day14;

public class Nestedprimenumber {

	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1;i<=10;i++)
		{
			int count=0;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}}
				if(count==0) {
			System.out.println(i);
			sum=sum+i;
			}}
		System.out.println(sum);
		
				
		}}
		

	
