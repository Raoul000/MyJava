package lambda;

import java.util.Comparator;

import staff.Staff;

public class ComplexComparator implements Comparator<Staff> {

	@Override
	// ����Salary��DataHired��������
	public int compare(Staff o1, Staff o2) {
		if (o1.getSalary() == o2.getSalary()) {
			return o1.getDataHired().compareTo(o2.getDataHired());
		} else {
			// Salary��������
			return o2.getSalary() - o1.getSalary();
		}
	}

}
