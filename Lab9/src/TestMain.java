public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		Employee emp1 = new Employee();
		emp1.setEmpId("1001");
		emp1.setName("Arnab");
		emp1.setBasic(15000.0);
		emp1.setHra(12500.0);
		emp1.setPerAllowances(30.0);
		emp1.setRole(Roles.DESIGNER);
		
		Employee emp2 = new Employee();
		emp2.setEmpId("1002");
		emp2.setName("Sahil");
		emp2.setBasic(16000.0);
		emp2.setHra(13500.0);
		emp2.setPerAllowances(40.0);
		emp2.setRole(Roles.TEST_ENG);
		
		Employee emp3 = new Employee();
		emp3.setEmpId("1003");
		emp3.setName("Rahul");
		emp3.setBasic(17000.0);
		emp3.setHra(14500.0);
		emp3.setPerAllowances(20.0);
		emp3.setRole(Roles.SR_DEVELOPER);
		
		Employee emp4 = new Employee();
		emp4.setEmpId("1004");
		emp4.setName("Shivam");
		emp4.setBasic(18000.0);
		emp4.setHra(15500.0);
		emp4.setPerAllowances(50.0);
		emp4.setRole(Roles.DESIGNER);
		
		
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



















