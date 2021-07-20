public class TestMain {
	public static void main(String[] args) {
		SwapData obj = new SwapData();
		System.out.println("Enter arg1: ");
		int arg1 = Console.readInt();
		System.out.println("Enter arg2: ");
		int arg2 = Console.readInt();
		obj.setArg1(arg1);
		obj.setArg2(arg2);

// Call set methods of SwapData object

		obj.displayValues("Before Swapping...");

		obj.swapValues();

		obj.displayValues("After Swapping...");
	}
}
