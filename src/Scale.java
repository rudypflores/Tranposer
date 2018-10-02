public class Scale {
	//Set variables where W = whole step & H = half step
	//MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'};
	//MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'};

	private final String[] chordTypes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C"};

	public String[] getChordTypes() {
		return this.chordTypes;
	}

	//This method will determine how many whole and half steps will be used
	public double scaleMultiplier(String scale) {
		double scaleMultiplier = 0;
		switch(scale) {
			case "C":
				scaleMultiplier = 0;
				break;
			case "C#":
				scaleMultiplier = 0.5;
				break;
			case "D":
				scaleMultiplier = 1;
				break;
			case "D#":
				scaleMultiplier = 1.5;
				break;
			case "E":
				scaleMultiplier = 2;
				break;
			case "F":
				scaleMultiplier = 2.5;
				break;
			case "F#":
				scaleMultiplier = 3;
				break;
			case "G":
				scaleMultiplier = 3.5;
				break;
			case "G#":
				scaleMultiplier = 4;
				break;
			case "A":
				scaleMultiplier = 4.5;
				break;
			case "A#":
				scaleMultiplier = 5;
				break;
			case "B":
				scaleMultiplier = 5.5;
				break;
		}
		return scaleMultiplier;
	}
}