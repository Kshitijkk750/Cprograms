package threads.synchronize;

public class Demo02_Banking {

	public static void main(String[] args) {
		Account acc= new Account();
		Customer c1= new Customer("Kshitij", acc);
		Customer c2= new Customer("Devashish", acc);
		
		Thread tt1= new Thread(c1);
		Thread tt2= new Thread(c2);
		
		tt1.start();
		tt2.start();
	}

}
