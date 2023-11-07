package concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class Demo_Concerrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer, String> mp= new ConcurrentHashMap<Integer, String>();
		
		mp.put(101, "Kshitij");
		mp.put(104, "Devashish");
		mp.put(102, "Mahesh");
		mp.put(103, "Pranav");
		
		Runnable Task = ()->{
			for(int i=105;i<=107;i++) {
				mp.put(i, "value "+i);
			}
		};
		
		Thread th1=new Thread(Task);
		Thread th2= new Thread(Task);
		
		th1.start();
		th2.start();
		
//		try {
//			th1.join();
//			th2.join();
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		System.out.println(mp);

	}

}
