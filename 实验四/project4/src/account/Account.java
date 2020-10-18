package account;

import java.util.Date;

public class Account {
	private String name;
	private double balance;
	private double rate;
	private Date date;

	public Account() {
		this.name = "";
		this.balance = 0;
		this.date = new Date();
		this.rate = rate;
	}

	public Account(String name, double balance, double rate, Date date) {
		super();
		this.name = name;
		this.balance = balance;
		this.rate = rate;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double deposit(double money) {
		if (money <= 0) {
			System.out.println("Deposit Wrong");
			return getBalance();
		}
		setBalance(getBalance() + money);
		return getBalance();
	}

	public double withdraw(double money) {
		if (money < 0 || money > this.balance) {
			System.out.println("Withdraw Wrong");
			return getBalance();
		}
		setBalance(getBalance() - money);
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", rate=" + rate + ", date=" + date + "]";
	}

}
