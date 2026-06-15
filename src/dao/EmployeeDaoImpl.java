package dao;
import java.sql.*;
import java.util.*;

import Model.Employee;
import util.DBConnection;

public class EmployeeDaoImpl implements EmployeeDao{

	public void addEmployee(Employee emp){
		
		String sql = "INSERT INTO employee(emp_name,email,phone,salary,joining_date,dept_id) VALUES(?,?,?,?,?,?)";
		
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql)){
			
			ps.setString(1,emp.getEmpName());

			ps.setString(2,emp.getEmail());

			ps.setString(3,emp.getPhone());

			ps.setDouble(4,emp.getSalary());

			ps.setDate(5,emp.getJoiningDate());

			ps.setInt(6,emp.getDeptId());


			ps.executeUpdate();
			
			System.out.println("Employee Added");
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
	}
	public List<Employee>getAllEmployees()
	{
		
		List<Employee> list = new ArrayList<>();
		
		String sql = "SELECT * FROM employee";

		try(Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql))
		{
			
			while(rs.next()){
				
			Employee e=new Employee();
			
			e.setEmpId(rs.getInt("emp_id"));
			e.setEmpName(rs.getString("emp_name"));
			e.setEmail(rs.getString("Email"));
			e.setSalary(rs.getDouble("salary"));
			
			list.add(e);
			
			
			}
		}
		catch(Exception e){
			e.printStackTrace();
		
		}
		
		return list;
		
	}
	 
	//Update Employee
	
	public void updateEmployee(Employee emp){
		
		String sql = "UPDATE employee SET Salary = ?WHERE emp_id=?";
		
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql)){
			
			ps.setDouble(1, emp.getSalary());
			ps.setInt(2, emp.getEmpId());
			ps.executeUpdate();
			
			System.out.println("Updated");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteEmployee(int id){
		
		String sql = "DELETE FROM employee WHERE emp_id=?";
		
		try(Connection con = DBConnection.getConnection();
		 PreparedStatement ps = con.prepareStatement(sql))
		{
			ps.setInt(1, id);
			ps.executeUpdate();
			
			System.out.println("Deleted");
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
}
