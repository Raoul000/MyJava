package lambda;

import java.time.LocalDate;

public class SecurityGuard extends Staff {
	private String skills;
	private int dangerousAllowance;

	public SecurityGuard(String name, String address, int age, String sex, int salary, LocalDate dataHired,
			String skills, int dangerousAllowance) {
		super(name, address, age, sex, salary, dataHired);
		this.skills = skills;
		this.dangerousAllowance = dangerousAllowance;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getDangerousAllowance() {
		return dangerousAllowance;
	}

	public void setDangerousAllowance(int dangerousAllowance) {
		this.dangerousAllowance = dangerousAllowance;
	}

	@Override
	public int getSalary() {
		return super.getSalary() + this.getDangerousAllowance();
	}
}
