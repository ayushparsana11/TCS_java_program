package Day10_Bank_Activity;

public class MainTransaction {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccname("Yuvraj Goswami");
		acc.setEmail("yuvraj@gmail.com");
		acc.setBalance(20000);
		
		Transaction transaction = new Transaction();
		
		// Deposit Test
		transaction.deposite(acc, 25000);  // Exceeds deposit limit
		transaction.deposite(acc, 15000);  // Valid deposit
		
		// Print account details
		System.out.println(acc);
		
		// Withdrawal Test
		transaction.withdraw(acc, 5000);  // Valid withdrawal
		transaction.withdraw(acc, 20000); // Exceeds withdrawal limit
		transaction.withdraw(acc, 8000);  // Insufficient balance
		
		// Print account details
		System.out.println(acc);
	}
}
