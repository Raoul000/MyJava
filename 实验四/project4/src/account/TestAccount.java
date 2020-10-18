package account;

import java.util.ArrayList;
import java.util.Date;

public class TestAccount {

	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList();
		Account res1 = new Account("Jack", 10000, 5, new Date());
		Account res2 = new CheckingAccount("Mick", 0, 5, new Date());
		Account res3 = new SavingAccount("Peter", 20000, 5, new Date());
		accounts.add(res1);
		accounts.add(res2);
		accounts.add(res3);
		System.out.println("初始账户信息：");
		for (Account temp : accounts) {
			System.out.println(temp);
		}
		System.out.println("存取款操作后：");
		res2.deposit(3000);
		res2.withdraw(6000);
		res1.withdraw(11000);
		res3.withdraw(10000);
		for (Account temp : accounts) {
			System.out.println(temp);
		}

	}

}
