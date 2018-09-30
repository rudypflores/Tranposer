public class Scale {
	//Set variables where W = whole step & H = half step
	//MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'};
	//MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'};

	private final String[] chordTypes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C"};

	public String[] getChordTypes() {
		return this.chordTypes;
	}

	//This method will determine how many whole and half steps will be used
	public int scaleMultiplier(String scale) {
		int scaleMultiplier = 0;
		switch(scale) {
			case "C":
				scaleMultiplier = 0;
				break;
			case "C#":
				scaleMultiplier = 1;
				break;
			case "D":
				scaleMultiplier = 2;
				break;
			case "D#":
				scaleMultiplier = 3;
				break;
			case "E":
				scaleMultiplier = 4;
				break;
			case "F":
				scaleMultiplier = 5;
				break;
			case "F#":
				scaleMultiplier = 6;
				break;
			case "G":
				scaleMultiplier = 7;
				break;
			case "G#":
				scaleMultiplier = 8;
				break;
			case "A":
				scaleMultiplier = 9;
				break;
			case "A#":
				scaleMultiplier = 10;
				break;
			case "B":
				scaleMultiplier = 11;
				break;
		}
		return scaleMultiplier;
	}
}