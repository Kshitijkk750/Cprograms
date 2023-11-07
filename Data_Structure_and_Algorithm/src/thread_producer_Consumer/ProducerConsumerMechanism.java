package thread_producer_Consumer;

import java.util.*;

class Producer implements Runnable{
	private final Vector<Integer> buffer;
	private final int size;
	
	
	public Producer(Vector<Integer> buffer, int size) {
		this.buffer = buffer;
		this.size = size;
	}
		public void produce(int i) throws InterruptedException {
			
			synchronized (buffer) {
				while(buffer.size()==size) {
					System.out.println("the buffer is full..");
					System.out.println("Waiting to consume items.."+ buffer.size());
					
					buffer.wait();

					
				
				
			}
			buffer.add(i);
			System.out.println("Produced items "+ i);
			buffer.notifyAll();// unblock consumer
			}
			
						
			
		}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				produce(i);
				
			}
			catch(Exception e) {
				System.out.println("Produced Interupted");
			}
		}
		
	}
	
}

class Consumer implements Runnable{

	private final Vector<Integer> buffer;
	private final int size;
	
	public Consumer(Vector<Integer> buffer, int size) {
		this.buffer = buffer;
		this.size = size;
	}

	public int consume() throws InterruptedException{
		synchronized (buffer) {
			while(buffer.size()==0) {
				System.out.println("the buffer is Empty..");
				System.out.println("Waiting to produce items.."+ buffer.size());
				
				buffer.wait();
				
							
			}
			buffer.notifyAll();
			return(Integer)buffer.remove(0);
		}
		
		
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
			System.out.println("Consumed item "+ consume());
			Thread.sleep(100);
			}
			catch(Exception e) {
				
			}
			}
			
	}
	
}

public class ProducerConsumerMechanism {

	public static void main(String[] args) {
		Vector<Integer> buff = new Vector<>();
		int size=5;
		
		Producer p= new Producer(buff, size);
		
		Consumer c= new Consumer(buff, size);
		
		Thread t1= new Thread(p);
		Thread t2= new Thread(c);
		
		t1.start();
		t2.start();
		
		
	}

}
