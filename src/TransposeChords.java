public class TransposeChords {

	private String chords;
	private String scale;

	public TransposeChords() {
		this.chords = "CDEFGABC"; //Default will always be the C Major scale.
		this.scale = "D Major";
	}

	public TransposeChords(String chords, String scale) {
		this.chords = chords.toUpperCase(); //set the main chords to transpose & set them as upper case
		this.scale = scale;
		sort();
	}

	public void sort() {
		String[] current = new String[this.chords.length()];
		Scale type = new Scale

		//Sort chords for transposing
		for(int chord = 0; chord < current.length; chord++) {
			current[chord] = this.chords.charAt(chord) + "";

			if() {

			}
		}

		//Sort scale
	}
}