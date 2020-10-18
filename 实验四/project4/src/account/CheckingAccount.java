package account;

import java.util.Date;

public class CheckingAccount extends Account {

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String name, double balance, double rate, Date date) {
		super(name, balance, rate, date);
	}

	@Override
	public double withdraw(double money) {
		double highline = 5000;
		if (money > getBalance() + highline) {
			System.out.println("Withdraw Wrong");
			return getBalance();
		}
		setBalance(getBalance() - money);
		return getBalance();
	}
}
