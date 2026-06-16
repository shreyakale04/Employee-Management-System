package service;

import Model.Employee;
import java.util.List;

public interface EmployeeService {

	void add(Employee e);
	
	List<Employee> getEmployee();
	
	void update(Employee e);
	
	void delete(int id);
	
}
