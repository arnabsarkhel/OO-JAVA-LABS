public class EmployeeReport {
	private String dtReport;
	public EmployeeReport(String dtReport) {
		this.dtReport = dtReport;
		
	}
	
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
		System.out.println("EMP_ID\tNAME\tROLE\t\tBASIC\tHRA\tALLOW\tSALARY");
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		
		for(int i=0;i<=empArr.length-1;i++)
		{
			System.out.print(empArr[i].empId);
			System.out.print("	");
			System.out.print(empArr[i].name);
			System.out.print("	");
			System.out.print(empArr[i].getRoleDescription());
			System.out.print("	");
			System.out.print(empArr[i].basic);
			System.out.print("	");
			System.out.print(empArr[i].hra);
			System.out.print("	");
			System.out.print(empArr[i].getSalary(empArr[i]));
			System.out.print("	");
			System.out.println(empArr[i].getAllowance(empArr[i]));
		}
		
		
		displayFooter(empArr.length);
		
	}
	
	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}
	public String getDtReport() {
		return dtReport;
	}
}