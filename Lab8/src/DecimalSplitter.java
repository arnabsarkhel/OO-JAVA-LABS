public class DecimalSplitter {
	private static String s;
	private static String s1;
	private static String[] arrOfStr;
	static boolean isOdd(int num) {
		if (num %2 == 0){
			return false;
		}
		return true;
	}
	static int getWhole(double num) {
//Complete the logic
		s  = String.valueOf(num);
		s1 = s.replace('.',' ');
		arrOfStr = s1.split(" ");
		int whole = Integer.parseInt(arrOfStr[0]);
		return whole;
	}
	
	static double getFraction(double num) {
//Complete the logic
		s  = String.valueOf(num);
		s1 = s.replace('.',' ');
		arrOfStr = s1.split(" ");
		return Double.parseDouble("0."+ arrOfStr[1]);
	}
}









