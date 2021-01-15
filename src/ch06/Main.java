package ch06;

import ch06.dao.EmployeeDao;
import ch06.dao.EmployeeDaoImpl;
import ch06.presentation.EmployeeIo;
import ch06.service.EmployeeService;
import ch06.service.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) {
		EmployeeDao empDao = new EmployeeDaoImpl();
		EmployeeService empService = new EmployeeServiceImpl(empDao);
		EmployeeIo empIo = new EmployeeIo(empService);
		
		empIo.play();		
	}
}
