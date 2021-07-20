public class AccManager  {
	public void fillAccountData(Account a1) {
		System.out.println("Enter accNo: ");
		a1.setAccNo(Console.readLine());
		System.out.println("Enter Name: ");
		a1.setName(Console.readLine());
		System.out.println("Enter Balance: ");
		a1.setBalance(Console.readDouble());
	

	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
