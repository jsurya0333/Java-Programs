package PreInterviewCoding;

public class MyThreadWait extends Thread {
	
	private static final Object key=new Object();
	
	public static void main (String[] args) {
		
		Thread t1=new Thread(()->{
			synchronized(key){
				
				System.out.println("THREAD 1 STARTS");
				System.out.println("THREAD 1 IS GOING TO WAIT UNTIL THREAD 2 NOTIFIES");
				
				try {
					key.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("THREAD 1 ENDS");
				
			}
		});
		Thread t2=new Thread(()->{
			synchronized(key) {
				System.out.println("THREAD 2 STARTS");
				System.out.println("THREAD  2 IS GOING TO SLEEP FOR 3 SECS");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("THREAD 2 GOING TO NOTIFY THREAD 1");
				key.notify();
				System.out.println("THREAD 2 ENDS");
			}
		});
		t1.start();
		t2.start();
		
	}
	

}
