public class Scale {
	//Set variables where W = whole step & H = half step
	//MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'};
	//MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'};

	private final String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C"};
    private final int[] major = { 2, 2, 1, 2, 2, 2, 1 };
    private final int[] minor = { 2, 1, 2, 2, 1, 2, 2 };

	public String[] getMinor() {
		return this.minor;
	}

	public String[] getMajor() {
		return this.major;
	}

	public String[] getChords() {
		return this.notes;
	}
}