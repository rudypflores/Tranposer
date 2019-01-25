/*
* Minor and Major Transposer Application
* @author Rudy L. Pichola-Flores
* Date: October 4th, 2018
*/

public class Scale {
	//Set variables where W = whole step & H = half step
	//MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'};
	//MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'};

	private final String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C8"};
    private final int[] major = {0, 2, 4, 5, 7, 9, 11, 12};
    private final int[] minor = {0, 2, 3, 5, 7, 8, 10, 12};

	public int[] getMinor() {
		return this.minor;
	}

	public int[] getMajor() {
		return this.major;
	}

	public String[] getNotes() {
		return this.notes;
	}

	public int index(String scale) {
		//Set default to C 
		switch(scale) {
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