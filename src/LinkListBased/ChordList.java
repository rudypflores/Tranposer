//The ChordList Class
//@Author Rudy Flores
//Created on March 19, 2019

public class ChordList {

	//Set variables where W = whole step & H = half step
	//MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'};
	//MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'};

	private final String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    //private final int[] major = {0, 2, 4, 5, 7, 9, 11, 12};
    private final int[] major = {0, 2, 2, 1, 2, 2, 2, 1};
    //private final int[] minor = {0, 2, 3, 5, 7, 8, 10, 12};
    private final int[] minor = {0, 2, 1, 2, 2, 1, 2, 2};

    //Access the sequence for minor
    public int[] getMinor() {
		return this.minor;
	}

	//Access the sequence for major
	public int[] getMajor() {
		return this.major;
	}

	//Access the possible notes
	public String[] getNotes() {
		return this.notes;
	}

	//Get the starting point of the scale
	public int noteIndex(String note) {
		//Set default to C 
		switch(note) {
			case "C":
				return 0;
			case "C#":
				return 1;
			case "D":
				return 2;
			case "D#":
				return 3;
			case "E":
				return 4;
			case "F":
				return 5;
			case "F#":
				return 6;
			case "G":
				return 7;
			case "G#":
				return 8;
			case "A":
				return 9;
			case "A#":
				return 10;
			case "B":
				return 11;
		}

		return 0;
	}
}