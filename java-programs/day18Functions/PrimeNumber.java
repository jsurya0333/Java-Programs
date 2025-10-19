package day18Functions;

 class PrimeNumber {
	public void getPrime(int a) {
	
		for(int i=1;i<=a;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				
				}}
				if(count==2)
				{
					System.out.println(i);
				}
				
				
			}
		}
	}


