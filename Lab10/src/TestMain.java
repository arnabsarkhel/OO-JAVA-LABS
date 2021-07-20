public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		Employee emp1 = new Employee("1001","Arnab", 15000.0,12500.0,30.0, Roles.DEVELOPER);
		Employee emp2 = new Employee("1002","Sahil", 16000.0,13500.0,40.0, Roles.TEST_ENG);
		Employee emp3 = new Employee("1003","Rahul", 17000.0,14500.0,20.0, Roles.SR_DEVELOPER);
		Employee emp4 = new Employee("1004","Shivam", 18000.0,15500.0,50.0, Roles.DESIGNER);
		
		
		Employee employees[] = new Employee[4];

	// Assign objects of Employee to employees declared above
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp4;
		
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport empreport = new EmployeeReport();
		empreport.setDtReport(dtReport);
		

	// Invoke display() method by passing the employee array
		empreport.display(employees);
		
	}		
}