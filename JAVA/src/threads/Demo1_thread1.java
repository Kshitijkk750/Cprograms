package threads;

public class Demo1_thread1 extends Thread {

	public void run() {
		for(int i=0;i<10;i++) {
			if(this.getName().equals("Second")) {
				try {
					sleep(1000);
				}
				catch(Exception e) {
					
				}
			}
			System.out.println(this.getName()+ i);
		}
	}
		
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//name of thread..
		System.out.println(Thread.currentThread());//name, priority, name.

		Demo1_thread1 t1= new Demo1_thread1();
		Demo1_thread1 t2= new Demo1_thread1();// newly born stage..
		
		t1.setName("First");
		t2.setName("Second");
		
		t1.start();
		t2.start();// ReadyToRun 
		
		t2.setPriority(MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		try {
			t1.join();
			//t2.join();
		}
		catch(Exception e) {
			
		}
		
		System.out.println("Main Thread Exited..");
	}

}
