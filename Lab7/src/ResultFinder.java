public class ResultFinder {
	private int m1;
	private int m2;
	private int m3;
	
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}

	
	
	// Create setter and getter methods 

	public void displayMarks() {
		System.out.println("Marks in three subjects are: ");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

	
	}
	public int getTotal() {
//		complete the logic
		return m1+m2+m3;
	}
	public double getAverage() {
//		complete the logic
		return (m1+m2+m3)/3;
	}
	
	public String getResult() {

//		complete the logic
		if(m1+m2+m3 < 40) {
			return "Fail";
		}
		return "Pass";
		

	}
}
