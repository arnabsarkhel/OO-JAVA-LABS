public enum Roles {
	 DEVELOPER(1),TEST_ENG(2), SR_DEVELOPER(3),DESIGNER(4);
	private int value;
	private Roles(int value) {
		this.value= value;
	}
	public int getValue() {
		return value;
	}
}