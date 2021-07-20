public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		double salary = 0.0;
		
		salary = emp.getBasic() + emp.getHra() + (emp.getBasic()*emp.getPerAllowances()/100);
		
		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowance = 0.0;

	// Complete the logic
		allowance = emp.getBasic()*emp.getPerAllowances() / 100;

		return allowance;
	}
}
