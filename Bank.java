package Day10_Bank_Activity;

public interface Bank {
	int MIN_BAL = 1000;
	int DEPOSITE_LIMIT = 20000;
	int WITHDROW_LIMIT = 10000;
	
	void deposite(Account acc, int amt);
	void withdraw(Account acc, int amt);
}
