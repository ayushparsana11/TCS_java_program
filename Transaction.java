package Day10_Bank_Activity;

public class Transaction implements Bank {
	@Override
	public void deposite(Account acc, int amt) {
		if (amt > DEPOSITE_LIMIT) {
			System.out.println("Deposit not possible. Amount exceeds the limit.");
		} else {
			int newBalance = acc.getBalance() + amt;
			acc.setBalance(newBalance);
			System.out.println("Amount deposited: " + amt);
		}
	}
	
	@Override
	public void withdraw(Account acc, int amt) {
		if (amt >WITHDROW_LIMIT) {
			System.out.println("Withdrawal not possible. Amount exceeds the limit.");
		} else if (acc.getBalance() - amt < MIN_BAL) {
			System.out.println("Insufficient balance. Cannot withdraw.");
		} else {
			int newBalance = acc.getBalance() - amt;
			acc.setBalance(newBalance);
			System.out.println("Amount withdrawn: " + amt);
		}
	}
}
