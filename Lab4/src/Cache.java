
public class Cache {
	
	private static int MAX_CAPACITY = Console.readInt();
	
	// Implement static block
	
	static int getMaxCapacity() {
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
	}
}