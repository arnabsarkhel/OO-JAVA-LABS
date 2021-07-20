public class Employee {
	String empID;
	String name;
	Address add = new Address();
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(String addrLine1, String addrLine2,String city,String pin) {
		add.setAddrLine1(addrLine1);
		add.setAddrLine2(addrLine2);
		add.setCity(city);
		add.setPin(pin);
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
