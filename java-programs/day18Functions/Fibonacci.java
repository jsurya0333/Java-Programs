package day18Functions;

 class Fibonacci {
	 public void getFibo(int t) {
	 int a=0;
	 int b=1;
	 
		 for(int i=0;i<5;i++) {
			 System.out.println(a);
			 int sum=a+b;
			 a=b;
			 b=sum;
			 
		 }
	 }

}
