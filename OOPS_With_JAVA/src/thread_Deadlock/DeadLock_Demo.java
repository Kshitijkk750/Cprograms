package thread_Deadlock;

public class DeadLock_Demo {

	public static void main(String[] args) {
		String rec1="Aman";
		String rec2="Suman";
		
		Thread t1= new Thread() {

			@Override
			public void run() {
				synchronized (rec1) {
					System.out.println("Thread 1 uses resource 1 " + rec1);
					try {
						sleep(10);
					} catch(Exception e) {
						
					}
				
				synchronized (rec2) {
					System.out.println("Thread 1 uses resource 2 " + rec2);

				}
				
				}
			}
			
		};
		
		Thread t2= new Thread() {

			@Override
			public void run() {
				synchronized (rec2) {
					System.out.println("Thread 2 uses resource 2 " + rec2);
					try {
						sleep(10);
					} catch(Exception e) {
						
					}
				
				synchronized (rec1) {
					System.out.println("Thread 2 uses resource 1 " + rec2);

				}
				
				}
			}
			
		};
		t1.start();
		t2.start();
	}

}
