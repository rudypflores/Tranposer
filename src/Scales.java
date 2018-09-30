public class Scale {
	//Set variables where W = whole step & H = half step
	private final char[] MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'};
	private final char[] MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'};

	public char[] getMajor() {
		return this.MAJOR;
	}

	public char[] getMinor() {
		return this.MINOR;
	}
}