public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}

	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		String empId = Console.readLine();
		emp.setEmpID(empId);
		System.out.println("Enter Name : ");
		String name = Console.readLine();
		emp.setName(name);
		System.out.println("Address Line1 : ");
		String addrLine1 = Console.readLine();;
		System.out.println("Address Line2 : ");
		String addrLine2 = Console.readLine();
		System.out.println("Address City : ");
		String city = Console.readLine();
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		emp.setAdd(addrLine1, addrLine2, city, pin);
	}
	public static void showData(Employee emp) {
		
		System.out.print("Emp Id : ");
		System.out.println(emp.getEmpID());
		System.out.print("Name : ");
		System.out.println(emp.getName());
		System.out.println("--------------------------------------------");
		System.out.print("Addr Line1 : ");
		System.out.println(emp.getAdd().getAddrLine1());
		System.out.print("Addr Line2 : ");
		System.out.println(emp.getAdd().getAddrLine2());
		System.out.print("City : ");
		System.out.println(emp.getAdd().getCity());
		System.out.print("Pin : ");
		System.out.println(emp.getAdd().getPin());
		System.out.println("--------------------------------------------");

		


	}
}














