package threads;

public class Demo02_Thread02 implements Runnable {
	String name;
	

	public Demo02_Thread02(String name) {
			this.name= name;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			//ERROR
			//ERROR
			//ERROR
			//ERROR
			//ERROR
		    //ERROR

			
			//System.out.println(this.getName()+ i);
			
		}
	}

	public static void main(String[] args) {
		Demo02_Thread02 th1= new Demo02_Thread02("One");
		Demo02_Thread02 th2= new Demo02_Thread02("Two");
		
		Thread t1= new Thread(th1);
		Thread t2= new Thread(th2);
		
		t1.start();
		t2.start();
		t2.start();
		
			
	}

}
