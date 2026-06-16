package main;
import Model.Employee;
import service.EmployeeServiceImpl;
import service.EmployeeService;
import java.sql.Date;

public class Main {

	public static void main(String[] args) {
	
		EmployeeService service = new EmployeeServiceImpl();
		
		Employee emp = new Employee(
				"Vaishnavi",
				"jkl@gmail.com",
				"8889995670",
				80000,
				Date.valueOf("2024-04-06"),
				1);
		
		service.add(emp);
		
		for(Employee e : service.getEmployee()){
			
			System.out.println(e);
		}
	}

}
