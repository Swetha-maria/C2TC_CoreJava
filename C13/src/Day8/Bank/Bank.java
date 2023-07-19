package Day8.Bank;

public interface Bank {

	final int MAX_DEPOSIT = 25000;
	final int MIN_BALANCE = 2000;
	
	void deposit(float amount);
	void withdraw(float amount);
	
}
