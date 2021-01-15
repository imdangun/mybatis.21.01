package ch06.domain;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String empName;
	private LocalDate hireDate;
	
	@Override
	public String toString() {
		return String.format("%d %s %s", empId, empName, hireDate);
	}
}
