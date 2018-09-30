public class TransposeChords {

	private String chords;
	private String[] transposedChords;
	

	public TransposeChords() {
		this.chords = "CDEFGABC"; //Default will always be the C Major scale.
	}

	public TransposeChords(String chords) {
		this.chords = chords.toUpperCase(); //set the main chords to transpose & set them as upper case
	}

	public void transpose() {
		String[] temp = new String[this.chords.length()];

		//Seperate chords for easier transposing
		for(int i = 0; i < temp.length; i++) {
			temp[i] = this.chords.charAt(i) + "";
		}



		//Debug
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp [i] + " ");
		}
	}
}