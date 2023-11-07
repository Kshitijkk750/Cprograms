package threads.synchronize;

public class Account {
		private int balance=10000;
		public boolean isSufficientBalance(int amount) {
			if(amount>balance) {
				return false;
			}
			return true;
		}
		
		public void withdraw(int amount) {
//			if(isSufficientBalance(amount)) {
//				balance= balance-amount;
//				System.out.println("Remaining balance is :"+ balance);
//			}
//			else {
//				System.out.println("inSufficient balance...");
//			}
			
			balance=balance-amount;
			System.out.println("Remaining balance is :"+ balance);

			
		}
}
