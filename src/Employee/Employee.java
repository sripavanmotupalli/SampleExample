package Employee;

public class Employee {
	
	private int EmployeeId;
	private String EmployeeName;
	private String EmployeeDepartment;
	private double EmployeeSalary;
	private String EmployeeAdress;
	
	public Employee(int employeeId, String employeeName, String employeeDepartment, double employeeSalary,
			String employeeAdress) {
		
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeDepartment = employeeDepartment;
		EmployeeSalary = employeeSalary;
		EmployeeAdress = employeeAdress;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return EmployeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		EmployeeDepartment = employeeDepartment;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	public String getEmployeeAdress() {
		return EmployeeAdress;
	}

	public void setEmployeeAdress(String employeeAdress) {
		EmployeeAdress = employeeAdress;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeDepartment="
				+ EmployeeDepartment + ", EmployeeSalary=" + EmployeeSalary + ", EmployeeAdress=" + EmployeeAdress
				+ "]";
	}
	
	
	
	

}
