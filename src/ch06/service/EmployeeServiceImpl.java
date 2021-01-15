package ch06.service;

import java.util.List;

import ch06.dao.EmployeeDao;
import ch06.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao empDao;
	
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	@Override
	public List<Employee> getEmployees() {
		return empDao.selectEmployees();		
	}
}
