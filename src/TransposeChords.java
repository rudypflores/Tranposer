public class TransposeChords {

	private String chords;
	private String scale;
	private String type;

	public TransposeChords() {
		this.chords = "CDEFGABC"; //Default will always be the C Major scale.
		this.scale = "D".toUpperCase();
		this.type = "Major".toUpperCase();
	}

	public TransposeChords(String chords, String scale, String type) {
		this.chords = chords.toUpperCase(); //set the main chords to transpose & set them as upper case
		this.scale = scale.toUpperCase();
		this.type = type.toUpperCase();
		sort();
	}

	public void sort() {
		//Initialize array & string
		String[] current = new String[this.chords.length()];
		String transposedChords = "";
		
		//Import array from Scale.java & store it
		Scale scaleChord = new Scale();
		String[] base = scaleChord.getChordTypes();

		//Get the index where the scale will start transposing from
		double index = scaleChord.scaleMultiplier(this.scale);

		//Iterator for the chords we're transposing
		for(int chord = 0; chord < current.length; chord++) {
			current[chord] = this.chords.charAt(chord) + "";
		}

		//Check for type of scale
		//Define steps as half steps in increments 0f .5
		if(this.type.equals("MAJOR")) {
			for(double i = index; i < this.chords.length()+2; i++) {
				transposedChords += base[i] + " ";
			}
		}

		System.out.println(transposedChords);
	}
}