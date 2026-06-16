package service;
import dao.*;
import Model.Employee;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{


EmployeeDao dao = new EmployeeDaoImpl();

   public void add(Employee e){
	
	dao.addEmployee(e);
   }
   
	public List<Employee>getEmployee()
	{
	return dao.getAllEmployees();
	}
	

    public void update(Employee e)
	{
	dao.updateEmployee(e);
	}



	public void delete(int id)
	{
	dao.deleteEmployee(id);
	}

}


