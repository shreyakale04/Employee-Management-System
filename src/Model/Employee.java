package Model;

import java.sql.Date;

public class Employee {

	private int empId;
    private String empName;
    private String email;
    private String phone;
    private double salary;
    private Date joiningDate;
    private int deptId;
    
    public Employee(){
    	
    }
    public Employee(String empName, String email,
            String phone, double salary,
            Date joiningDate, int deptId) {

    	this.empName = empName;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.deptId = deptId;
}
    public int getEmpId() {
        return empId;
    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }


    public String getEmpName() {
        return empName;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Date getJoiningDate() {
        return joiningDate;
    }


    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }


    public int getDeptId() {
        return deptId;
    }
    
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
  
    public String toString() {

        return empId+" "
                +empName+" "
                +email+" "
                +salary;
    }
}
