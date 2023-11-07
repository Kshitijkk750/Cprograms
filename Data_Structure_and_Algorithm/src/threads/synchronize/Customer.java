package threads.synchronize;

import java.util.Scanner;

public class Customer implements Runnable{
		private String name;
		private Account account;
		
		
		public Customer(String name, Account account) {
			super();
			this.name = name;
			this.account = account;
		}


		@Override
		public void run() {
			Scanner sc= new Scanner(System.in);
			synchronized (account) {
				System.out.println("Name : "+name+ " enter ammount to withdraw.");
				int amount= sc.nextInt();
				
				
				if(account.isSufficientBalance(amount)) {
					System.out.println(this.name + "is going to withdraw "+ amount);
					account.withdraw(amount);
				}
				else {
					System.err.println("Insufficient balance");
				}
			}
			
			
		}
		
		
		
}
