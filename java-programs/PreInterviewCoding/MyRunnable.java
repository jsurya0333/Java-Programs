package PreInterviewCoding;

public class MyRunnable implements Runnable {
	
	public void run() {
		for(int i=1;i<=5;i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				
			}
		}
	}

}
