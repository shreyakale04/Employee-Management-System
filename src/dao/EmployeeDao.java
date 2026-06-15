package dao;
import java.util.List;
import Model.Employee;


public interface EmployeeDao {

	//Add, update and Delete Employee
	
	void addEmployee(Employee employee);
	
	List<Employee>getAllEmployees();
	
	 void updateEmployee(Employee employee);
     
	 void deleteEmployee(int id);
	
}
