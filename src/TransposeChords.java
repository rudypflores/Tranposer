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
		
		//Import array from Scale.java
		Scale scaleChord = new Scale();
		String[] base = scaleChord.getChordTypes();

		//Initialize scale multiplier
		int index = scaleChord.scaleMultiplier(scale); //Outputs the index of what chord it is

		//Define current[]
		for(int chord = 0; chord < current.length; chord++) {
			current[chord] = this.chords.charAt(chord) + "";
		}

		//Check for type of scale
		if(this.type.equals("MAJOR")) {
			for(int i = index; i < this.chords.length()+2; i++) {
				transposedChords += base[i] + " ";
			}
		}

		System.out.println(transposedChords);
	}
}