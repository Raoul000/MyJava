package staff;

import java.util.Date;

public class Dean extends Teacher {
	private int adminAward;

	public Dean(String name, String address, int age, String sex, int salary, Date dataHired, String department,
			String speciality, int postAllowancec, int adminAward) {
		super(name, address, age, sex, salary, dataHired, department, speciality, postAllowancec);
		this.adminAward = adminAward;
	}

	public int getAdminAward() {
		return adminAward;
	}

	public void setAdminAward(int adminAward) {
		this.adminAward = adminAward;
	}

	@Override
	public int getSalary() {
		return super.getSalary() + this.getAdminAward();
	}
}
