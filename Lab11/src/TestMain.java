public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		Employee emp1 = new Employee("1001","Arnab", 15000.0,12500.0,30.0, Roles.DEVELOPER.getValue());
		Employee emp2 = new Employee("1002","Sahil", 16000.0,13500.0,40.0, Roles.TEST_ENG.getValue());
		Employee emp3 = new Employee("1003","Rahul", 17000.0,14500.0,20.0, Roles.SR_DEVELOPER.getValue());
		Employee emp4 = new Employee("1004","Shivam", 18000.0,15500.0,50.0, Roles.DESIGNER.getValue());
		
		System.out.println("Enter empid: ");
		String empid = Console.readLine();
		System.out.println("Enter name: ");
		String name = Console.readLine();
		System.out.println("Enter basic: ");
		double basic = Console.readDouble();
		System.out.println("Enter hra: ");
		double hra = Console.readDouble();
		System.out.println("Enter perallowance: ");
		double PerAllowances= Console.readDouble();
		System.out.println("Enter ROLE(DEVELOPE/TEST_ENG/SR_DEVELOPER/DESIGNER): ");
		String rolename = Console.readLine();
		Employee emp5 = new Employee(empid, name, basic, hra, PerAllowances, Roles.valueOf(rolename).getValue());
		Employee employees[] = new Employee[5];

	// Assign objects of Employee to employees declared above
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp4;
		employees[4] = emp5;
		
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport empreport = new EmployeeReport(dtReport);
		

	// Invoke display() method by passing the employee array
		empreport.display(employees);
		
	}		
}