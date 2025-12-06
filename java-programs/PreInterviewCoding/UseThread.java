package PreInterviewCoding;

public class UseThread {

	public static void main(String[] args) {
		
		System.out.println("Main starts");
		//MyThread mt=new MyThread();
		//mt.start();
		
		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(()->{
			for(int i=1;i<=5;i++) 
				System.out.println("My thread 2 executes"+ " "+i);
			
		});
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=5;i++) 
				System.out.println("My thread 1 executes"+ " "+i);
			
		});
		MyThread t1=new MyThread();
		t.start();
		t2.start();
		
		System.out.println("Main ends");

		//sleep
		MyRunnable sleeps=new MyRunnable();
		Thread slp=new Thread(sleeps);
		slp.start();
		//sleep
		
	}

}
