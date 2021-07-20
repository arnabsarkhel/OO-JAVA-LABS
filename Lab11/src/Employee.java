public class Employee {
	
	// Identity variables of Employee 
	String empId;
	String name;
	double basic;
	double hra;
	double perAllowances;
	int role;
	
	public Employee(String empId, String name, Double basic, Double hra, Double perAllowances,  int role) {
		this.empId  = empId;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.perAllowances = perAllowances;
		this.role = role;
	}
	// Create getter and setter methods
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(Double hra) {
		this.hra = hra;
	}
	public double getPerAllowances() {
		return perAllowances;
	}
	public void setPerAllowances(Double perAllowances) {
		this.perAllowances = perAllowances;
	}	
	public void setRole(int role) {
		this.role = role;
	}
	public int getRole() {
		return role;
	}
	public double getSalary(Employee emp) {
		return SalaryCalculator.getAllowance(emp);
	}
	public double getAllowance(Employee emp)
	{
		return SalaryCalculator.getAllowance(emp);
	}
	public String getRoleDescription() {
		return RoleBuilder.getRoleDescription(role);
		
	}
}
