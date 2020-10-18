package account;

import java.util.Date;

public class SavingAccount extends Account {

	public SavingAccount() {
		super();
	}

	public SavingAccount(String name, double balance, double rate, Date date) {
		super(name, balance, rate, date);
	}

	@Override
	public double withdraw(double money) {
		if (money > getBalance()) {
			System.out.println("Withdraw Wrong");
			return getBalance();
		}
		setBalance(getBalance() - money);
		return getBalance();
	}
}
