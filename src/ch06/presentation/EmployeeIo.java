package ch06.presentation;

import java.util.List;

import ch06.domain.Employee;
import ch06.service.EmployeeService;

public class EmployeeIo {
	private EmployeeService empService;
	
	public EmployeeIo(EmployeeService empService) {
		this.empService = empService;
	}
	
	public void play() {
		List<Employee> empList = empService.getEmployees();
		
		for(Employee emp: empList)
			System.out.println(emp);
	}
}